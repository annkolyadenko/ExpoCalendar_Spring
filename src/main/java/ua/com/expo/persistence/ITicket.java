package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.Expo;
import ua.com.expo.persistence.domain.Ticket;

import java.util.LinkedHashMap;
import java.util.List;

public interface ITicket {

    List<Ticket> findAllTicketsByUserId(Long id);

    Ticket save(Ticket ticket);

    //TODO PAGINATION & CUSTOM QUERY
    LinkedHashMap<Expo, Long> countAllPurchasedTickets();
}
