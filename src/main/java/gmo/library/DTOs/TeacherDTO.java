package gmo.library.DTOs;

import gmo.library.Entities.Teacher;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TeacherDTO extends ReaderDTO {
    static {
        setEntityClass(Teacher.class);
    }

    private DepartmentDTO department;
    private DegreeDTO degree;
    private GradeDTO grade;
    private PointOfIssueDTO pointOfIssue;

    public interface TeacherProjection extends ReaderProjection {
        DepartmentDTO.DepartmentProjection getDepartment();
        DegreeDTO.DegreeProjection getDegree();
        GradeDTO.GradeProjection getGrade();
        PointOfIssueDTO.PointOfIssueProjection getPointOfIssue();
    }
}
