package gmo.library.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class OneTimeReader extends Reader {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ReadingRoomID")
    private ReadingRoom readingRoom;
    @Temporal(value= TemporalType.DATE)
    private Date takeDate;
}
