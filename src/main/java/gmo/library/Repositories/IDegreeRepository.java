package gmo.library.Repositories;

import gmo.library.Entities.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IDegreeRepository extends JpaRepository<Degree, Long> {
}
