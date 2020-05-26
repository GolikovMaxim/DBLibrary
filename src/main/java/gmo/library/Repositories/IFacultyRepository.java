package gmo.library.Repositories;

import gmo.library.Entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface IFacultyRepository extends JpaRepository<Faculty, Long> {
}
