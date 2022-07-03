import ru.netology.domain.Ticket;
import ru.netology.repositiry.TicketRepository;

public class TicketRepositoryTest {
    TicketRepository repo = new TicketRepository();
    Ticket ticket1 = new Ticket(10,1299, "SVO", "KZN",1.35);
    Ticket ticket2 = new Ticket(20,2199, "VKO", "KZN",1.35);

}
