package gmo.library.Repositories;

import gmo.library.DTOs.PenaltyDTO;
import gmo.library.Entities.Penalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = PenaltyDTO.PenaltyProjection.class)
public interface IPenaltyRepository extends JpaRepository<Penalty, Long> {
}
