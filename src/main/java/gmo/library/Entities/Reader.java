package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
public abstract class Reader extends AbstractEntity<Long> {
    private String firstName;
    private String secondName;
    private String lastName;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate birthday;
}
