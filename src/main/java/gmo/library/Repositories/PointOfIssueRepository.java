package gmo.library.Repositories;

import gmo.library.Entities.PointOfIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointOfIssueRepository extends JpaRepository<PointOfIssue, Long> {
}
