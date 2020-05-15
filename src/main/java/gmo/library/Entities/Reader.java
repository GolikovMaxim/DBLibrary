package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
public abstract class Reader extends AbstractEntity<Long> {
    private String firstName;
    private String secondName;
    private String lastName;
    @Temporal(value = TemporalType.DATE)
    private Date birthday;
}
