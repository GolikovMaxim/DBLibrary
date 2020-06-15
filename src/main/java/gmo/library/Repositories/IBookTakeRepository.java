package gmo.library.Repositories;

import gmo.library.DTOs.BookTakeDTO;
import gmo.library.Entities.BookTake;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = BookTakeDTO.BookTakeProjection.class)
public interface IBookTakeRepository extends JpaRepository<BookTake, Long> {
    @Query("" +
            "select distinct b from BookTake b where " +
            "(:lastName = '' or b.reader.lastName like concat('%', :lastName, '%')) and " +
            "(:firstName = '' or b.reader.firstName like concat('%', :firstName, '%')) and " +
            "(:secondName = '' or b.reader.secondName like concat('%', :secondName, '%')) and " +
            "(:poiid = 0 or :poiid = b.pointOfIssue.id) and " +
            "(:bookName = '' or b.issue.bookName like concat('%', :bookName, '%')) and " +
            "(:takeDateAfter = '' or b.takeDate > date(:takeDateAfter))")
    Page<BookTake> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                                @Param("secondName") String secondName, @Param("poiid") Integer poiid,
                                @Param("bookName") String bookName, @Param("takeDateAfter") String date, Pageable pageable);
}
