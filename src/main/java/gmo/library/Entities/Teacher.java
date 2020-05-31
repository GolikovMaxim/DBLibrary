package gmo.library.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
public class Teacher extends Reader {
    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "DegreeID")
    private Degree degree;
    @ManyToOne
    @JoinColumn(name = "GradeId")
    private Grade grade;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "POIID")
    private PointOfIssue pointOfIssue;
}
