package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Department extends AbstractEntity<Long> {
    private Faculty faculty;
    private String name;
}
