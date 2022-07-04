package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repositiry.TicketRepository;

public class TicketManagerTest {
    private TicketRepository repository = new TicketRepository();
    private TicketManager manager = new TicketManager(repository);

    Ticket ticket1 = new Ticket(10, 2099, "SVO", "KZN", 1.35);
    Ticket ticket2 = new Ticket(20, 2199, "VKO", "KZN", 1.35);
    Ticket ticket3 = new Ticket(30, 1199, "VKO", "KZN", 1.35);
    Ticket ticket4 = new Ticket(40, 1299, "SVO", "KZN", 1.35);

    @BeforeEach
    public void setUp() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);


    }

    @Test
    public void shouldFindAllVko() {
        Ticket[] expected = {ticket2, ticket3};
        Ticket[] actual = manager.findAll("VKO", "KZN");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllSvo() {
        Ticket[] expected = {ticket1, ticket4};
        Ticket[] actual = manager.findAll("SVO", "KZN");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSort() {
        Ticket[] expected = {ticket3, ticket4, ticket1, ticket2};
        Ticket[] actual = manager.sort(repository.getTickets());
        Assertions.assertArrayEquals(expected, actual);
    }


}
