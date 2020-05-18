package gmo.library.Repositories;

import gmo.library.Entities.ReadingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReadingRoomRepository extends JpaRepository<ReadingRoom, Long> {
}
