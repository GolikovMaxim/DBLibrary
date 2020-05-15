package gmo.library.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class OneTimeReader extends Reader {
    private ReadingRoom readingRoom;
    @Temporal(value= TemporalType.DATE)
    private Date takeDate;
}