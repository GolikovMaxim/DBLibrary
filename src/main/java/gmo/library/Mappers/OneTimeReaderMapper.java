package gmo.library.Mappers;

import gmo.library.DTOs.OneTimeReaderDTO;
import gmo.library.DTOs.ReadingRoomDTO;
import gmo.library.Entities.OneTimeReader;
import gmo.library.Entities.Reader;
import gmo.library.Entities.ReadingRoom;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneTimeReaderMapper extends AbstractMapper<OneTimeReader, OneTimeReaderDTO, Long> {
    @Autowired
    public OneTimeReaderMapper(ModelMapper mapper) {
        super(mapper, OneTimeReader.class, OneTimeReaderDTO.class);
    }

    @Override
    protected void mapEntityToDTO(OneTimeReader entity, OneTimeReaderDTO DTO) {
        mappers.get(Reader.class).mapEntityToDTO(entity, DTO);
        DTO.setReadingRoom((ReadingRoomDTO) mappers.get(ReadingRoom.class).toDTO(entity.getReadingRoom()));
        DTO.setTakeDate(entity.getTakeDate());
    }

    @Override
    protected void mapDTOToEntity(OneTimeReaderDTO DTO, OneTimeReader entity) {
        mappers.get(Reader.class).mapDTOToEntity(DTO, entity);
        entity.setReadingRoom((ReadingRoom) mappers.get(ReadingRoom.class).toEntity(DTO.getReadingRoom()));
        entity.setTakeDate(DTO.getTakeDate());
    }
}
