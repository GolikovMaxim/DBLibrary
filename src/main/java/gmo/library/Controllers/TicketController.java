package gmo.library.Controllers;

import gmo.library.DTOs.TicketDTO;
import gmo.library.Entities.Ticket;
import gmo.library.Mappers.AbstractMapper;
import gmo.library.Mappers.IMapper;
import gmo.library.Repositories.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final ITicketRepository ticketRepository;

    @Autowired
    public TicketController(ITicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping
    public ResponseEntity<Page<TicketDTO>> getTickets(Pageable pageable) {
        IMapper<Ticket, TicketDTO, Long> ticketMapper = AbstractMapper.mappers.get(Ticket.class);
        return ResponseEntity.ok(ticketRepository.findAll(pageable).map(ticketMapper::toDTO));
    }
}
