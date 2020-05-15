package gmo.library.DTOs;

import gmo.library.Entities.Grade;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GradeDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Grade.class);
    }

    private String name;
}
