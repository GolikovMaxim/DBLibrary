package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class OneTimeReader extends Reader {
    @ManyToOne
    @JoinColumn(name = "ReadingRoomID")
    private ReadingRoom readingRoom;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate takeDate;
}
