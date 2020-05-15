package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class FileCabinet extends AbstractEntity<Long> {
    private PointOfIssue pointOfIssue;
}
