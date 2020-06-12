package gmo.library.Repositories;

import gmo.library.DTOs.GradeDTO;
import gmo.library.Entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = GradeDTO.GradeProjection.class)
public interface IGradeRepository extends JpaRepository<Grade, Long> {

}
