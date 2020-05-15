package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Faculty extends AbstractEntity<Long> {
    private String name;
}
