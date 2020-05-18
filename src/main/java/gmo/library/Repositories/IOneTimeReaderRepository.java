package gmo.library.Repositories;

import gmo.library.Entities.OneTimeReader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOneTimeReaderRepository extends JpaRepository<OneTimeReader, Long> {
}
