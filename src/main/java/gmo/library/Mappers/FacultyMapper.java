package gmo.library.Mappers;

import gmo.library.DTOs.FacultyDTO;
import gmo.library.Entities.Faculty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacultyMapper extends AbstractMapper<Faculty, FacultyDTO, Long> {
    @Autowired
    public FacultyMapper(ModelMapper mapper) {
        super(mapper, Faculty.class, FacultyDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Faculty entity, FacultyDTO DTO) {
        DTO.setName(entity.getName());
    }

    @Override
    protected void mapDTOToEntity(FacultyDTO DTO, Faculty entity) {
        entity.setName(DTO.getName());
    }
}
