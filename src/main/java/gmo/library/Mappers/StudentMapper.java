package gmo.library.Mappers;

import gmo.library.DTOs.PointOfIssueDTO;
import gmo.library.DTOs.StudentDTO;
import gmo.library.DTOs.StudyGroupDTO;
import gmo.library.Entities.PointOfIssue;
import gmo.library.Entities.Reader;
import gmo.library.Entities.Student;
import gmo.library.Entities.StudyGroup;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper extends AbstractMapper<Student, StudentDTO, Long> {
    @Autowired
    public StudentMapper(ModelMapper mapper) {
        super(mapper, Student.class, StudentDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Student entity, StudentDTO DTO) {
        mappers.get(Reader.class).mapEntityToDTO(entity, DTO);
        DTO.setPointOfIssue((PointOfIssueDTO) mappers.get(entity.getPointOfIssue().getClass()).toDTO(entity.getPointOfIssue()));
        DTO.setGroup((StudyGroupDTO) mappers.get(StudyGroup.class).toDTO(entity.getGroup()));
    }

    @Override
    protected void mapDTOToEntity(StudentDTO DTO, Student entity) {
        mappers.get(Reader.class).mapDTOToEntity(DTO, entity);
        entity.setPointOfIssue((PointOfIssue) mappers.get(DTO.getPointOfIssue().getEntityClass()).toEntity(DTO.getPointOfIssue()));
        entity.setGroup((StudyGroup) mappers.get(StudyGroup.class).toEntity(DTO.getGroup()));
    }
}
