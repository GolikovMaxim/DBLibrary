package gmo.library.Mappers;

import gmo.library.DTOs.GradeDTO;
import gmo.library.Entities.Grade;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GradeMapper extends AbstractMapper<Grade, GradeDTO, Long> {
    @Autowired
    public GradeMapper(ModelMapper mapper) {
        super(mapper, Grade.class, GradeDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Grade entity, GradeDTO DTO) {
        DTO.setName(entity.getName());
    }

    @Override
    protected void mapDTOToEntity(GradeDTO DTO, Grade entity) {
        entity.setName(DTO.getName());
    }
}
