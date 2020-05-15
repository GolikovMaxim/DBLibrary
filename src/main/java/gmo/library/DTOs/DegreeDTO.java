package gmo.library.DTOs;

import gmo.library.Entities.Degree;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DegreeDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Degree.class);
    }

    private String name;
}
