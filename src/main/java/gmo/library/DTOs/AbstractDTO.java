package gmo.library.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public abstract class AbstractDTO<ID extends Serializable> implements Serializable {
    @Getter @Setter
    private static Class entityClass;

    private ID id;

    public Class getEntityClass() {
        return entityClass;
    }
}
