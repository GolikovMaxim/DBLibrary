package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class StudyGroup extends AbstractEntity<Long> {
    private Faculty faculty;
}
