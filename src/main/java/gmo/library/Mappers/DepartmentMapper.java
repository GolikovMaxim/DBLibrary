package gmo.library.Mappers;

import gmo.library.DTOs.DepartmentDTO;
import gmo.library.Entities.Department;
import gmo.library.Entities.Faculty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper extends AbstractMapper<Department, DepartmentDTO, Long> {
    @Autowired
    public DepartmentMapper(ModelMapper mapper) {
        super(mapper, Department.class, DepartmentDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Department entity, DepartmentDTO DTO) {
        DTO.setFaculty(((FacultyMapper)mappers.get(Faculty.class)).toDTO(entity.getFaculty()));
        DTO.setName(entity.getName());
    }

    @Override
    protected void mapDTOToEntity(DepartmentDTO DTO, Department entity) {
        entity.setFaculty(((FacultyMapper)mappers.get(Faculty.class)).toEntity(DTO.getFaculty()));
        entity.setName(DTO.getName());
    }
}
