package gmo.library.Repositories;

import gmo.library.DTOs.OffenceDTO;
import gmo.library.Entities.BookTake;
import gmo.library.Entities.Offence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = OffenceDTO.OffenceProjection.class)
public interface IOffenceRepository extends JpaRepository<Offence, Long> {
    @Query("" +
            "select distinct o from Offence o where " +
            "(:lastName = '' or o.bookTake.reader.lastName like concat('%', :lastName, '%')) and " +
            "(:firstName = '' or o.bookTake.reader.firstName like concat('%', :firstName, '%')) and " +
            "(:secondName = '' or o.bookTake.reader.secondName like concat('%', :secondName, '%')) and " +
            "(:poiid = 0 or :poiid = o.bookTake.pointOfIssue.id) and " +
            "(:bookName = '' or o.bookTake.issue.bookName like concat('%', :bookName, '%')) and " +
            "(:accrualDateAfter = '' or o.accrualDate > date(:accrualDateAfter)) and " +
            "(:endDateAfter = '' or o.endDate > date(:endDateAfter))")
    Page<Offence> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                                @Param("secondName") String secondName, @Param("poiid") Integer poiid,
                                @Param("bookName") String bookName, @Param("accrualDateAfter") String accrualDate,
                               @Param("endDateAfter") String endDate, Pageable pageable);
}
