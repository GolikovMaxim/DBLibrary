package gmo.library.DTOs;

import gmo.library.Entities.Penalty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter @Setter
public class PenaltyDTO extends AbstractDTO<Long> {
    static {
        setEntityClass(Penalty.class);
    }

    private LocalDate accrualDate;
    private int cost;
    private LocalDate payDate;
    private OffenceDTO offence;

    public interface PenaltyProjection extends AbstractProjection<Long> {
        LocalDate getAccrualDate();
        int getCost();
        LocalDate getPayDate();
        OffenceDTO.OffenceProjection getOffence();
    }
}
