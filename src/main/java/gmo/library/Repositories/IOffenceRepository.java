package gmo.library.Repositories;

import gmo.library.DTOs.OffenceDTO;
import gmo.library.Entities.Offence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = OffenceDTO.OffenceProjection.class)
public interface IOffenceRepository extends JpaRepository<Offence, Long> {
}
