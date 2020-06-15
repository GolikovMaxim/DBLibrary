package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter @Setter
public class BookTake extends AbstractEntity<Long> {
    @ManyToOne
    @JoinColumn(name = "ReaderID")
    private Reader reader;
    @ManyToOne
    @JoinColumn(name = "IssueID")
    private Issue issue;
    @ManyToOne
    @JoinColumn(name = "POIID")
    private PointOfIssue pointOfIssue;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate takeDate;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate returnDate;
}
