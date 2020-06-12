package gmo.library.Repositories;

import gmo.library.DTOs.ReaderDTO;
import gmo.library.Entities.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = ReaderDTO.ReaderProjection.class)
public interface IReaderRepository extends JpaRepository<Reader, Long> {

}
