package gmo.library.Mappers;

import gmo.library.DTOs.StudyGroupDTO;
import gmo.library.Entities.Faculty;
import gmo.library.Entities.StudyGroup;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudyGroupMapper extends AbstractMapper<StudyGroup, StudyGroupDTO, Long> {
    @Autowired
    public StudyGroupMapper(ModelMapper mapper) {
        super(mapper, StudyGroup.class, StudyGroupDTO.class);
    }

    @Override
    protected void mapEntityToDTO(StudyGroup entity, StudyGroupDTO DTO) {
        DTO.setFaculty(((FacultyMapper)mappers.get(Faculty.class)).toDTO(entity.getFaculty()));
    }

    @Override
    protected void mapDTOToEntity(StudyGroupDTO DTO, StudyGroup entity) {
        entity.setFaculty(((FacultyMapper)mappers.get(Faculty.class)).toEntity(DTO.getFaculty()));
    }
}
