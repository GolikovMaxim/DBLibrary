package gmo.library.Mappers;

import gmo.library.DTOs.AbstractDTO;
import gmo.library.Entities.AbstractEntity;
import lombok.Getter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import java.io.Serializable;
import java.util.HashMap;

@Getter
public abstract class AbstractMapper<E extends AbstractEntity<ID>, DTO extends AbstractDTO<ID>, ID extends Serializable>
        implements IMapper<E, DTO, ID> {
    protected static final HashMap<Class, AbstractMapper> mappers = new HashMap<>();

    private final ModelMapper mapper;
    private final TypeMap<E, DTO> entityToDTOMap;
    private final TypeMap<DTO, E> DTOToEntityMap;
    private final Class<E> entityClass;
    private final Class<DTO> DTOClass;

    protected AbstractMapper(ModelMapper mapper, Class<E> entityClass, Class<DTO> DTOClass) {
        this.mapper = mapper;
        this.entityClass = entityClass;
        this.DTOClass = DTOClass;
        entityToDTOMap = mapper.createTypeMap(entityClass, DTOClass).setPostConverter(toDTOConverter());
        DTOToEntityMap = mapper.createTypeMap(DTOClass, entityClass).setPostConverter(toEntityConverter());
        mappers.put(entityClass, this);
    }

    private Converter<E, DTO> toDTOConverter() {
        return context -> {
            E source = context.getSource();
            DTO destination = context.getDestination();
            mapEntityToDTO(source, destination);
            return destination;
        };
    }

    private Converter<DTO, E> toEntityConverter() {
        return context -> {
            DTO source = context.getSource();
            E destination = context.getDestination();
            mapDTOToEntity(source, destination);
            return destination;
        };
    }

    protected void mapEntityToDTO(E entity, DTO DTO) {

    }

    protected void mapDTOToEntity(DTO DTO, E entity) {

    }

    @Override
    public E toEntity(DTO dto) {
        return dto == null ? null : mapper.map(dto, entityClass);
    }

    @Override
    public DTO toDTO(E entity) {
        return entity == null ? null : mapper.map(entity, DTOClass);
    }
}
