package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Penalty extends AbstractEntity<Long> {
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate accrualDate;
    private int cost;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate payDate;
    @ManyToOne
    @JoinColumn(name = "OffenceID")
    private Offence offence;
}
