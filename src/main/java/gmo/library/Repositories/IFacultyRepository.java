package gmo.library.Repositories;

import gmo.library.DTOs.FacultyDTO;
import gmo.library.Entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = FacultyDTO.FacultyProjection.class)
public interface IFacultyRepository extends JpaRepository<Faculty, Long> {
}
