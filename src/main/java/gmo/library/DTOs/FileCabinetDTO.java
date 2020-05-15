package gmo.library.DTOs;

import gmo.library.Entities.FileCabinet;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FileCabinetDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(FileCabinet.class);
    }

    private PointOfIssueDTO pointOfIssue;
}
