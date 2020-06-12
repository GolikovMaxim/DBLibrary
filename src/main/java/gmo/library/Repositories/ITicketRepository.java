package gmo.library.Repositories;

import gmo.library.DTOs.TicketDTO;
import gmo.library.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = TicketDTO.TicketProjection.class)
public interface ITicketRepository extends JpaRepository<Ticket, Long> {
}
