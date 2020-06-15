package gmo.library.DTOs;

import gmo.library.Entities.Offence;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter @Getter
public class OffenceDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Offence.class);
    }

    private LocalDate accrualDate;
    private LocalDate endDate;
    private BookTakeDTO bookTake;

    public interface OffenceProjection extends AbstractProjection<Long> {
        LocalDate getAccrualDate();
        LocalDate getEndDate();
        BookTakeDTO.BookTakeProjection getBookTake();
    }
}
