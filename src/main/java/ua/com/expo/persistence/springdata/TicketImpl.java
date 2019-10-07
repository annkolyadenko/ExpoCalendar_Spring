package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.ITicket;
import ua.com.expo.persistence.domain.Expo;
import ua.com.expo.persistence.domain.Ticket;
import ua.com.expo.persistence.repository.TicketRepository;

import java.util.LinkedHashMap;
import java.util.List;

@Repository
@AllArgsConstructor
public class TicketImpl implements ITicket {

    private final TicketRepository ticketRepository;


    @Override
    public List<Ticket> findAllTicketsByUserId(Long id) {
        return ticketRepository.findAllByUserId(id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    //TODO
    @Override
    public LinkedHashMap<Expo, Long> countAllPurchasedTickets() {
        return null;
    }
}
