package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter @Setter
public class Offence extends AbstractEntity<Long> {
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate accrualDate;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "BookTakeID")
    private BookTake bookTake;
}
