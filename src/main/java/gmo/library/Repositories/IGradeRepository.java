package gmo.library.Repositories;

import gmo.library.Entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface IGradeRepository extends JpaRepository<Grade, Long> {

}
