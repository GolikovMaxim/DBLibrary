package gmo.library.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Student extends Reader {
    @ManyToOne
    @JoinColumn(name = "groupid")
    private StudyGroup group;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "POIID")
    private PointOfIssue pointOfIssue;
}
