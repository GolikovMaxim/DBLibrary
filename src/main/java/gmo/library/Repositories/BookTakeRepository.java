package gmo.library.Repositories;

import gmo.library.Entities.BookTake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTakeRepository extends JpaRepository<BookTake, Long> {
}
