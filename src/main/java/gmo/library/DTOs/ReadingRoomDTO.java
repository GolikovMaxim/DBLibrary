package gmo.library.DTOs;

import gmo.library.Entities.ReadingRoom;

public class ReadingRoomDTO extends PointOfIssueDTO {
    static {
        setEntityClass(ReadingRoom.class);
    }

    public interface ReadingRoomProjection extends PointOfIssueProjection {

    }
}
