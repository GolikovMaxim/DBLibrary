package gmo.library.Repositories;

import gmo.library.DTOs.FileCabinetDTO;
import gmo.library.Entities.FileCabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = FileCabinetDTO.FileCabinetProjection.class)
public interface IFileCabinetRepository extends JpaRepository<FileCabinet, Long> {
}
