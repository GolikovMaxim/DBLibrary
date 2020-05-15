package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public abstract class PointOfIssue extends AbstractEntity<Long> {

}
