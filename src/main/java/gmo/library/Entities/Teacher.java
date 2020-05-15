package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Teacher extends Reader {
    private Department department;
    private Degree degree;
    private Grade grade;
    private PointOfIssue pointOfIssue;
}
