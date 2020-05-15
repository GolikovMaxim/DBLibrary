package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Penalty extends AbstractEntity<Long> {
    @Temporal(value= TemporalType.DATE)
    private Date accrualDate;
    private int cost;
    @Temporal(value=TemporalType.DATE)
    private Date payDate;
    private Offence offence;
}
