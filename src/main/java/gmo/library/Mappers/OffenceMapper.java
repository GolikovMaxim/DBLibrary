package gmo.library.Mappers;

import gmo.library.DTOs.BookTakeDTO;
import gmo.library.DTOs.OffenceDTO;
import gmo.library.DTOs.ReaderDTO;
import gmo.library.Entities.BookTake;
import gmo.library.Entities.Offence;
import gmo.library.Entities.Reader;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OffenceMapper extends AbstractMapper<Offence, OffenceDTO, Long> {
    @Autowired
    public OffenceMapper(ModelMapper mapper) {
        super(mapper, Offence.class, OffenceDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Offence entity, OffenceDTO DTO) {
        DTO.setAccrualDate(entity.getAccrualDate());
        DTO.setBookTake((BookTakeDTO) mappers.get(BookTake.class).toDTO(entity.getBookTake()));
        DTO.setEndDate(entity.getEndDate());
    }

    @Override
    protected void mapDTOToEntity(OffenceDTO DTO, Offence entity) {
        entity.setAccrualDate(DTO.getAccrualDate());
        entity.setBookTake((BookTake) mappers.get(BookTake.class).toEntity(DTO.getBookTake()));
        entity.setEndDate(DTO.getEndDate());
    }
}
