package gmo.library.DTOs;

import gmo.library.Entities.BookTake;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter @Setter
public class BookTakeDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(BookTake.class);
    }

    private ReaderDTO reader;
    private IssueDTO issue;
    private PointOfIssueDTO pointOfIssue;
    private LocalDate takeDate;
    private LocalDate returnDate;

    public interface BookTakeProjection extends AbstractProjection<Long> {
        ReaderDTO.ReaderProjection getReader();
        IssueDTO.IssueProjection getIssue();
        PointOfIssueDTO.PointOfIssueProjection getPointOfIssue();
        LocalDate getTakeDate();
        LocalDate getReturnDate();
    }
}
