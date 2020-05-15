package gmo.library.Mappers;

import gmo.library.DTOs.BookTakeDTO;
import gmo.library.DTOs.PointOfIssueDTO;
import gmo.library.DTOs.ReaderDTO;
import gmo.library.Entities.BookTake;
import gmo.library.Entities.Issue;
import gmo.library.Entities.PointOfIssue;
import gmo.library.Entities.Reader;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookTakeMapper extends AbstractMapper<BookTake, BookTakeDTO, Long> {
    @Autowired
    public BookTakeMapper(ModelMapper mapper) {
        super(mapper, BookTake.class, BookTakeDTO.class);
    }

    @Override
    protected void mapEntityToDTO(BookTake entity, BookTakeDTO DTO) {
        DTO.setIssue(((IssueMapper)mappers.get(Issue.class)).toDTO(entity.getIssue()));
        DTO.setPointOfIssue((PointOfIssueDTO) mappers.get(entity.getPointOfIssue().getClass()).toDTO(entity.getPointOfIssue()));
        DTO.setReader((ReaderDTO) mappers.get(entity.getReader().getClass()).toDTO(entity.getReader()));
        DTO.setReturnDate(entity.getReturnDate());
        DTO.setTakeDate(entity.getTakeDate());
    }

    @Override
    protected void mapDTOToEntity(BookTakeDTO DTO, BookTake entity) {
        entity.setIssue((Issue) mappers.get(Issue.class).toEntity(DTO.getIssue()));
        entity.setPointOfIssue((PointOfIssue) mappers.get(DTO.getPointOfIssue().getEntityClass()).toEntity(DTO.getPointOfIssue()));
        entity.setReader((Reader) mappers.get(DTO.getReader().getEntityClass()).toEntity(DTO.getReader()));
        entity.setReturnDate(DTO.getReturnDate());
        entity.setTakeDate(DTO.getTakeDate());
    }
}
