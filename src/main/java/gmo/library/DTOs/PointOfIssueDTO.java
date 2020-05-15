package gmo.library.DTOs;

import gmo.library.Entities.PointOfIssue;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class PointOfIssueDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(PointOfIssue.class);
    }
}
