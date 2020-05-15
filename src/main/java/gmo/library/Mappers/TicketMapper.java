package gmo.library.Mappers;

import gmo.library.DTOs.TicketDTO;
import gmo.library.Entities.PointOfIssue;
import gmo.library.Entities.Ticket;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper extends AbstractMapper<Ticket, TicketDTO, Long> {
    @Autowired
    public TicketMapper(ModelMapper mapper) {
        super(mapper, Ticket.class, TicketDTO.class);
    }

    @Override
    protected void mapEntityToDTO(Ticket entity, TicketDTO DTO) {
        mappers.get(PointOfIssue.class).mapEntityToDTO(entity, DTO);
    }

    @Override
    protected void mapDTOToEntity(TicketDTO DTO, Ticket entity) {
        mappers.get(PointOfIssue.class).mapDTOToEntity(DTO, entity);
    }
}
