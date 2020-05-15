package gmo.library.DTOs;

import gmo.library.Entities.Penalty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class PenaltyDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Penalty.class);
    }

    private Date accrualDate;
    private int cost;
    private Date payDate;
    private OffenceDTO offence;
}
