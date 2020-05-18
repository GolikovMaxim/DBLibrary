package gmo.library.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.Collection;

public interface IService<DTO, ID extends Serializable> {
    long countAll();
    DTO getById(ID id);
    Page<DTO> getAll(Pageable pageable);
    Collection<DTO> getAllById(Collection<ID> idCollection);
    DTO create(DTO dto);
    DTO save(DTO dto);
    Collection<DTO> saveAll(Collection<DTO> dtoCollection);
    void deleteById(ID id);
    void deleteAllById(Collection<ID> idCollection);
}
