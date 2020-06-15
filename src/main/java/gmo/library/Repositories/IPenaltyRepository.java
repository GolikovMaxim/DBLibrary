package gmo.library.Repositories;

import gmo.library.DTOs.PenaltyDTO;
import gmo.library.Entities.Penalty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = PenaltyDTO.PenaltyProjection.class)
public interface IPenaltyRepository extends JpaRepository<Penalty, Long> {
    @Query("" +
            "select distinct p from Penalty p where " +
            "(:lastName = '' or p.offence.bookTake.reader.lastName like concat('%', :lastName, '%')) and " +
            "(:firstName = '' or p.offence.bookTake.reader.firstName like concat('%', :firstName, '%')) and " +
            "(:secondName = '' or p.offence.bookTake.reader.secondName like concat('%', :secondName, '%')) and " +
            "(:bookName = '' or p.offence.bookTake.issue.bookName like concat('%', :bookName, '%')) and " +
            "(:poiid = 0 or :poiid = p.offence.bookTake.pointOfIssue.id) and " +
            "(:accrualDateAfter = '' or p.accrualDate > date(:accrualDateAfter)) and " +
            "(:costMore = 0 or p.cost >= :costMore) and " +
            "(:costLess = 0 or p.cost <= :costLess) and " +
            "(:payDateAfter = '' or p.payDate > date(:payDateAfter))")
    Page<Penalty> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                               @Param("secondName") String secondName, @Param("bookName") String bookName,
                               @Param("accrualDateAfter") String accrualDate, @Param("payDateAfter") String endDate,
                               @Param("costMore") Integer costMore, @Param("costLess") Integer costLess,
                               @Param("poiid") Integer poiid,  Pageable pageable);
}
