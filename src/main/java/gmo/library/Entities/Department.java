package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
public class Department extends AbstractEntity<Long> {
    @ManyToOne
    @JoinColumn(name = "FacultyID")
    private Faculty faculty;
    private String name;
}
