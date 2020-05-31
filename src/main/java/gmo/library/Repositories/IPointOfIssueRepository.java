package gmo.library.Repositories;

import gmo.library.Entities.PointOfIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface IPointOfIssueRepository extends JpaRepository<PointOfIssue, Long> {
}
