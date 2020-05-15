package gmo.library.DTOs;

import gmo.library.Entities.Ticket;

public class TicketDTO extends PointOfIssueDTO {
    static {
        setEntityClass(Ticket.class);
    }
}
