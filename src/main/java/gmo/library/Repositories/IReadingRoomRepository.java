package gmo.library.Repositories;

import gmo.library.Entities.ReadingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface IReadingRoomRepository extends JpaRepository<ReadingRoom, Long> {
}
