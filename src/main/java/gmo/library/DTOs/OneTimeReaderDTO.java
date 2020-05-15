package gmo.library.DTOs;

import gmo.library.Entities.OneTimeReader;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class OneTimeReaderDTO extends ReaderDTO {
    static {
        setEntityClass(OneTimeReader.class);
    }

    private ReadingRoomDTO readingRoom;
    private Date takeDate;
}
