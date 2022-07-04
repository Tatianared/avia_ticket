package ru.netology.domain;

import ru.netology.repositiry.TicketRepository;

import java.util.Arrays;

public class TicketManager {
    protected TicketRepository repository;


    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.save(ticket);
    }


    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getFrom() == from) {
                if (ticket.getTo() == to) {
                    Ticket[] tmp = new Ticket[result.length + 1];
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];
                    }
                    tmp[tmp.length - 1] = ticket;
                    result = tmp;
                }
            }
        }
        return result;

    }


    public Ticket[] sort(Ticket[] tickets) {
        Ticket[] result = new Ticket[0];
        Arrays.sort(tickets);
        Ticket[] item = new Ticket[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            item[i] = tickets[i];
            result = item;
        }
        return result;
    }

}




