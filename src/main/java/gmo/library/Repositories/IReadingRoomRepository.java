package gmo.library.Repositories;

import gmo.library.DTOs.ReaderDTO;
import gmo.library.DTOs.ReadingRoomDTO;
import gmo.library.Entities.ReadingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ReadingRoomDTO.ReadingRoomProjection.class)
public interface IReadingRoomRepository extends JpaRepository<ReadingRoom, Long> {
}
