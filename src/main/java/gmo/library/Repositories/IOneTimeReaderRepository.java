package gmo.library.Repositories;

import gmo.library.Entities.OneTimeReader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IOneTimeReaderRepository extends JpaRepository<OneTimeReader, Long> {
    @Query("" +
            "select distinct r from Reader r " +
            "join OneTimeReader s on s.id = r.id where " +
            "(:lastName = '' or :lastName = r.lastName) and " +
            "(:firstName = '' or :firstName = r.firstName) and " +
            "(:secondName = '' or :secondName = r.secondName) and " +
            "(:poiid = 0 or :poiid = s.readingRoom.id)")
    Page<OneTimeReader> findByParams(@Param("lastName") String lastName, @Param("firstName") String firstName,
                               @Param("secondName") String secondName, @Param("poiid") Integer poiid, Pageable pageable);
}
