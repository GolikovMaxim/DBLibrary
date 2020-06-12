package gmo.library.Repositories;

import gmo.library.DTOs.IssueDTO;
import gmo.library.Entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = IssueDTO.IssueProjection.class)
public interface IIssueRepository extends JpaRepository<Issue, Long> {
}
