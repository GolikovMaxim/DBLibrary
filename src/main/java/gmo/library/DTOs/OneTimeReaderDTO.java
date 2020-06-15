package gmo.library.DTOs;

import gmo.library.Entities.OneTimeReader;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter @Getter
public class OneTimeReaderDTO extends ReaderDTO {
    static {
        setEntityClass(OneTimeReader.class);
    }

    private ReadingRoomDTO readingRoom;
    private LocalDate takeDate;

    public interface OneTimeReaderProjection extends ReaderProjection {
        ReadingRoomDTO.ReadingRoomProjection getReadingRoom();
        LocalDate getTakeDate();
    }
}
