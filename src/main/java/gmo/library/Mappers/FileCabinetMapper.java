package gmo.library.Mappers;

import gmo.library.DTOs.FileCabinetDTO;
import gmo.library.DTOs.PointOfIssueDTO;
import gmo.library.Entities.FileCabinet;
import gmo.library.Entities.PointOfIssue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileCabinetMapper extends AbstractMapper<FileCabinet, FileCabinetDTO, Long> {
    @Autowired
    public FileCabinetMapper(ModelMapper mapper) {
        super(mapper, FileCabinet.class, FileCabinetDTO.class);
    }

    @Override
    protected void mapEntityToDTO(FileCabinet entity, FileCabinetDTO DTO) {
        DTO.setPointOfIssue((PointOfIssueDTO) mappers.get(entity.getPointOfIssue().getClass()).toDTO(entity.getPointOfIssue()));
    }

    @Override
    protected void mapDTOToEntity(FileCabinetDTO DTO, FileCabinet entity) {
        entity.setPointOfIssue((PointOfIssue) mappers.get(DTO.getPointOfIssue().getEntityClass()).toEntity(DTO.getPointOfIssue()));
    }
}
