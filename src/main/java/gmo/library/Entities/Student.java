package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Student extends Reader {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupid")
    private StudyGroup group;
    @ManyToOne
    @JoinColumn(name = "POIID")
    private PointOfIssue pointOfIssue;
}
