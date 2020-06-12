package gmo.library.DTOs;

import gmo.library.Entities.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.rest.core.config.Projection;

@Getter @Setter
public class StudentDTO extends ReaderDTO {
    static {
        setEntityClass(Student.class);
    }

    private StudyGroupDTO group;
    private PointOfIssueDTO pointOfIssue;

    public interface StudentProjection extends ReaderProjection {
        StudyGroupDTO.StudyGroupProjection getGroup();
        PointOfIssueDTO.PointOfIssueProjection getPointOfIssue();
    }
}
