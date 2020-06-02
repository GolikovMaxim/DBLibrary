package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class StudyGroup extends AbstractEntity<Long> {
    @Column(name = "Number")
    private int number;
    @ManyToOne
    @JoinColumn(name = "facultyID")
    private Faculty faculty;
}
