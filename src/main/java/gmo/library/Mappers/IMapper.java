package gmo.library.Mappers;

import gmo.library.DTOs.AbstractDTO;
import gmo.library.Entities.AbstractEntity;

import java.io.Serializable;

public interface IMapper<E extends AbstractEntity<ID>, DTO extends AbstractDTO<ID>, ID extends Serializable> {
    E toEntity(DTO dto);
    DTO toDTO(E entity);
}
