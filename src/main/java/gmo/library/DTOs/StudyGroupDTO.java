package gmo.library.DTOs;

import gmo.library.Entities.StudyGroup;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StudyGroupDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(StudyGroup.class);
    }

    private int number;
    private FacultyDTO faculty;
}
