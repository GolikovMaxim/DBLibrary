package gmo.library.DTOs;

import gmo.library.Entities.Faculty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FacultyDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Faculty.class);
    }

    private String name;
}
