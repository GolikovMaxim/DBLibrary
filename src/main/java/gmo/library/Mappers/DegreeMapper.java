package gmo.library.Mappers;

import gmo.library.DTOs.DegreeDTO;
import gmo.library.Entities.Degree;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DegreeMapper extends AbstractMapper<Degree, DegreeDTO, Long> {
    @Autowired
    public DegreeMapper(ModelMapper mapper) {
        super(mapper, Degree.class, DegreeDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Degree entity, DegreeDTO DTO) {
        DTO.setName(entity.getName());
    }

    @Override
    protected void mapDTOToEntity(DegreeDTO DTO, Degree entity) {
        entity.setName(DTO.getName());
    }
}
