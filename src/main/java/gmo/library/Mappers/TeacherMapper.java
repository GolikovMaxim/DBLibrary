package gmo.library.Mappers;

import gmo.library.DTOs.*;
import gmo.library.Entities.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper extends AbstractMapper<Teacher, TeacherDTO, Long> {
    @Autowired
    public TeacherMapper(ModelMapper mapper) {
        super(mapper, Teacher.class, TeacherDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Teacher entity, TeacherDTO DTO) {
        mappers.get(Reader.class).mapEntityToDTO(entity, DTO);
        DTO.setDegree((DegreeDTO) mappers.get(Degree.class).toDTO(entity.getDegree()));
        DTO.setDepartment((DepartmentDTO) mappers.get(Department.class).toDTO(entity.getDepartment()));
        DTO.setGrade((GradeDTO) mappers.get(Grade.class).toDTO(entity.getGrade()));
        DTO.setPointOfIssue((PointOfIssueDTO) mappers.get(entity.getPointOfIssue().getClass()).toDTO(entity.getPointOfIssue()));
    }

    @Override
    protected void mapDTOToEntity(TeacherDTO DTO, Teacher entity) {
        mappers.get(Reader.class).mapDTOToEntity(DTO, entity);
        entity.setDegree((Degree) mappers.get(Degree.class).toEntity(DTO.getDegree()));
        entity.setDepartment((Department) mappers.get(Department.class).toEntity(DTO.getDepartment()));
        entity.setGrade((Grade) mappers.get(Grade.class).toEntity(DTO.getGrade()));
        entity.setPointOfIssue((PointOfIssue) mappers.get(DTO.getPointOfIssue().getEntityClass()).toEntity(DTO.getPointOfIssue()));
    }
}
