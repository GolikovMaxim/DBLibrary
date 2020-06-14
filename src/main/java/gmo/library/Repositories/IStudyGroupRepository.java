package gmo.library.Repositories;

import gmo.library.DTOs.StudyGroupDTO;
import gmo.library.Entities.StudyGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = StudyGroupDTO.StudyGroupProjection.class)
public interface IStudyGroupRepository extends JpaRepository<StudyGroup, Long> {
    StudyGroup findByNumber(@Param("number") int number);
}
