package gmo.library.Mappers;

import gmo.library.DTOs.PointOfIssueDTO;
import gmo.library.Entities.PointOfIssue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PointOfIssueMapper extends AbstractMapper<PointOfIssue, PointOfIssueDTO, Long> {
    @Autowired
    public PointOfIssueMapper(ModelMapper mapper) {
        super(mapper, PointOfIssue.class, PointOfIssueDTO.class);
    }
}
