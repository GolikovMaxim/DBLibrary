package gmo.library.Mappers;

import gmo.library.DTOs.ReaderDTO;
import gmo.library.Entities.Reader;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapper extends AbstractMapper<Reader, ReaderDTO, Long> {
    @Autowired
    public ReaderMapper(ModelMapper mapper) {
        super(mapper, Reader.class, ReaderDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Reader entity, ReaderDTO DTO) {
        DTO.setBirthday(entity.getBirthday());
        DTO.setFirstName(entity.getFirstName());
        DTO.setLastName(entity.getLastName());
        DTO.setSecondName(entity.getSecondName());
    }

    @Override
    protected void mapDTOToEntity(ReaderDTO DTO, Reader entity) {
        entity.setBirthday(DTO.getBirthday());
        entity.setFirstName(DTO.getFirstName());
        entity.setLastName(DTO.getLastName());
        entity.setSecondName(DTO.getSecondName());
    }
}
