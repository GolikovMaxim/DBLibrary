package gmo.library.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter @Setter
public class OneTimeReader extends Reader {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ReadingRoomID")
    private ReadingRoom readingRoom;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate takeDate;
}
