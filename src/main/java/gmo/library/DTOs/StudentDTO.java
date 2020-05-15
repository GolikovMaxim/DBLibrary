package gmo.library.DTOs;

import gmo.library.Entities.Student;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class StudentDTO extends ReaderDTO {
    static {
        setEntityClass(Student.class);
    }

    private StudyGroupDTO group;
    private PointOfIssueDTO pointOfIssue;
}
