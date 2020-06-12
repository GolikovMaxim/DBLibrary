package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class BookTake extends AbstractEntity<Long> {
    private Reader reader;
    private Issue issue;
    private PointOfIssue pointOfIssue;
    @Temporal(value=TemporalType.DATE)
    private Date takeDate;
    @Temporal(value=TemporalType.DATE)
    private Date returnDate;
}
