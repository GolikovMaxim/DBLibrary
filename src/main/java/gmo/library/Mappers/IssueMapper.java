package gmo.library.Mappers;

import gmo.library.DTOs.IssueDTO;
import gmo.library.Entities.FileCabinet;
import gmo.library.Entities.Issue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IssueMapper extends AbstractMapper<Issue, IssueDTO, Long> {
    @Autowired
    public IssueMapper(ModelMapper mapper) {
        super(mapper, Issue.class, IssueDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Issue entity, IssueDTO DTO) {
        DTO.setBookCount(entity.getBookCount());
        DTO.setBookName(entity.getBookName());
        DTO.setFileCabinet(((FileCabinetMapper)mappers.get(FileCabinet.class)).toDTO(entity.getFileCabinet()));
        DTO.setReceiptDate(entity.getReceiptDate());
    }

    @Override
    protected void mapDTOToEntity(IssueDTO DTO, Issue entity) {
        entity.setBookCount(DTO.getBookCount());
        entity.setBookName(DTO.getBookName());
        entity.setFileCabinet(((FileCabinetMapper)mappers.get(FileCabinet.class)).toEntity(DTO.getFileCabinet()));
        entity.setReceiptDate(DTO.getReceiptDate());
    }
}
