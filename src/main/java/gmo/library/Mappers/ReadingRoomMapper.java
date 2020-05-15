package gmo.library.Mappers;

import gmo.library.DTOs.ReadingRoomDTO;
import gmo.library.Entities.PointOfIssue;
import gmo.library.Entities.ReadingRoom;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadingRoomMapper extends AbstractMapper<ReadingRoom, ReadingRoomDTO, Long> {
    @Autowired
    public ReadingRoomMapper(ModelMapper mapper) {
        super(mapper, ReadingRoom.class, ReadingRoomDTO.class);
    }

    @Override
    protected void mapEntityToDTO(ReadingRoom entity, ReadingRoomDTO DTO) {
        mappers.get(PointOfIssue.class).mapEntityToDTO(entity, DTO);
    }

    @Override
    protected void mapDTOToEntity(ReadingRoomDTO DTO, ReadingRoom entity) {
        mappers.get(PointOfIssue.class).mapDTOToEntity(DTO, entity);
    }
}
