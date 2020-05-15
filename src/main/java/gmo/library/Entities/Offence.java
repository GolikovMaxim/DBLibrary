package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Offence extends AbstractEntity<Long> {
    @Temporal(value= TemporalType.DATE)
    private Date accrualDate;
    @Temporal(value=TemporalType.DATE)
    private Date endDate;
    private Reader reader;
    private BookTake bookTake;
}
