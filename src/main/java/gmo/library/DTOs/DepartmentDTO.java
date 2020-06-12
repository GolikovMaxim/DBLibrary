package gmo.library.DTOs;

import gmo.library.Entities.Department;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DepartmentDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Department.class);
    }

    private FacultyDTO faculty;
    private String name;

    public interface DepartmentProjection extends AbstractProjection<Long> {
        FacultyDTO.FacultyProjection getFaculty();
        String getName();
    }
}
