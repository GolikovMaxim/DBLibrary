package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Student extends Reader {
    private StudyGroup group;
    private PointOfIssue pointOfIssue;
}
