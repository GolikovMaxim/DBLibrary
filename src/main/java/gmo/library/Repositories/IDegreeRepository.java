package gmo.library.Repositories;

import gmo.library.Entities.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource(exported = false)
public interface IDegreeRepository extends JpaRepository<Degree, Long> {
}
