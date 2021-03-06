package gmo.library.Repositories;

import gmo.library.DTOs.OneTimeReaderDTO;
import gmo.library.Entities.OneTimeReader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = OneTimeReaderDTO.OneTimeReaderProjection.class)
public interface IOneTimeReaderRepository extends JpaRepository<OneTimeReader, Long> {
    @Query("" +
            "select distinct r from Reader r " +
            "join OneTimeReader s on s.id = r.id where " +
            "(:lastName = '' or r.lastName like concat('%', :lastName, '%')) and " +
            "(:firstName = '' or r.firstName like concat('%', :firstName, '%')) and " +
            "(:secondName = '' or r.secondName like concat('%', :secondName, '%')) and " +
            "(:poiid = 0 or :poiid = s.readingRoom.id)")
    Page<OneTimeReader> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                               @Param("secondName") String secondName, @Param("poiid") Integer poiid, Pageable pageable);
}
