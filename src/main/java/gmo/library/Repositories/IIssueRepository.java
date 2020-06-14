package gmo.library.Repositories;

import gmo.library.DTOs.IssueDTO;
import gmo.library.Entities.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = IssueDTO.IssueProjection.class)
public interface IIssueRepository extends JpaRepository<Issue, Long> {
    @Query(value = "select (i.BooksCount - (select count(*) FROM BookTake b where b.IssueID = i.ID and b.ReturnDate is null)) from Issue i where i.ID = :id",
        nativeQuery = true)
    Integer getBooksInStock(@Param("id") long id);

    @Query("select distinct i from Issue i where " +
            "(:bookName = '' or i.bookName like concat('%', :bookName, '%')) and " +
            "(:fileCabinet = 0 or :fileCabinet = i.fileCabinet.id)")
    Page<Issue> getByBookName(@Param("bookName") String name, @Param("fileCabinet") Integer fileCabinet, Pageable pageable);
}
