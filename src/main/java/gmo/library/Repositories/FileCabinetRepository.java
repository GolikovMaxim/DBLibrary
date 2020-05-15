package gmo.library.Repositories;

import gmo.library.Entities.FileCabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileCabinetRepository extends JpaRepository<FileCabinet, Long> {
}
