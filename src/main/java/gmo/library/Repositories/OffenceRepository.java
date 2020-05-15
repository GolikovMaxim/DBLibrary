package gmo.library.Repositories;

import gmo.library.Entities.Offence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffenceRepository extends JpaRepository<Offence, Long> {
}
