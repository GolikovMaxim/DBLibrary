package gmo.library.Repositories;

import gmo.library.Entities.FileCabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFileCabinetRepository extends JpaRepository<FileCabinet, Long> {
}
