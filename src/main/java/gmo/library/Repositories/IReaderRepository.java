package gmo.library.Repositories;

import gmo.library.Entities.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReaderRepository extends JpaRepository<Reader, Long> {
}
