package gmo.library.DTOs;

import gmo.library.Entities.Offence;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class OffenceDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Offence.class);
    }

    private Date accrualDate;
    private Date endDate;
    private ReaderDTO reader;
    private BookTakeDTO bookTake;
}
