package gmo.library.Controllers;

import gmo.library.DTOs.ReadingRoomDTO;
import gmo.library.Entities.ReadingRoom;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.IReadingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readingRooms")
public class ReadingRoomController {
    private final IReadingRoomRepository readingRoomRepository;

    @Autowired
    public ReadingRoomController(IReadingRoomRepository readingRoomRepository) {
        this.readingRoomRepository = readingRoomRepository;
    }

    @GetMapping
    public ResponseEntity<Page<ReadingRoomDTO>> getReadingRooms(Pageable pageable) {
        IMapper<ReadingRoom, ReadingRoomDTO, Long> readingRoomMapper = AbstractMapper.mappers.get(ReadingRoom.class);
        return ResponseEntity.ok(readingRoomRepository.findAll(pageable).map(readingRoomMapper::toDTO));
    }
}
