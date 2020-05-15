package gmo.library.Mappers;

import gmo.library.DTOs.OffenceDTO;
import gmo.library.DTOs.PenaltyDTO;
import gmo.library.Entities.Offence;
import gmo.library.Entities.Penalty;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PenaltyMapper extends AbstractMapper<Penalty, PenaltyDTO, Long> {
    @Autowired
    public PenaltyMapper(ModelMapper mapper) {
        super(mapper, Penalty.class, PenaltyDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Penalty entity, PenaltyDTO DTO) {
        DTO.setAccrualDate(entity.getAccrualDate());
        DTO.setCost(entity.getCost());
        DTO.setOffence((OffenceDTO) mappers.get(Offence.class).toDTO(entity.getOffence()));
        DTO.setPayDate(entity.getPayDate());
    }

    @Override
    protected void mapDTOToEntity(PenaltyDTO DTO, Penalty entity) {
        entity.setAccrualDate(DTO.getAccrualDate());
        entity.setCost(entity.getCost());
        entity.setOffence((Offence) mappers.get(Offence.class).toEntity(DTO.getOffence()));
        entity.setPayDate(DTO.getPayDate());
    }
}
