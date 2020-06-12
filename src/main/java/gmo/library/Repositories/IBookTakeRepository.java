package gmo.library.Repositories;

import gmo.library.DTOs.BookTakeDTO;
import gmo.library.Entities.BookTake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = BookTakeDTO.BookTakeProjection.class)
public interface IBookTakeRepository extends JpaRepository<BookTake, Long> {
}
