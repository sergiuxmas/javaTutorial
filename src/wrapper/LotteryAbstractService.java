package wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    @Description: Lottery service
 */
public abstract class LotteryAbstractService {
    /*
    @Description: Lottery capital
     */
    private static double debitCap;

    /*
    @Description: The number of available tickets
     */
    private static long tickets;

    /*
    @Description: The price of one ticket
    */
    private static double ticketPrice;

    /*
     @Description: the history of the number of tickets purchased by each person
     If the same user buys tickets repeatedly, then the quantity must be updated.
     */
    private Map<User, Long> procurementHistory;

    private DiscountService discountService;

    /*
    @Description: the history of discounts got by each person
    The same person might get several discounts
    */
    private List<Map<User, Discount>> discountHistory;

    static {
        debitCap = 10000;
        tickets = 5000;
        ticketPrice = 5;
    }

    public LotteryAbstractService() {
        procurementHistory = new HashMap<>();
        discountService = new DiscountService();
        discountHistory = new ArrayList<>();
    }

    /*
    @Description: Through this method a user can purchase tickets
     The cost of the purchased tickets is added to the debitCap.
     The number of available tickets is decreasing
     The method must process the following cases:
      - if the tickets are sold out. It should be a message, but the method should return null.
      - if the user is going to purchase more tickets than are available. It should be a message, but the method should return null.
     Every time a user buys a ticket, it must be checked if he can receive a discount.
     If a user receives a discount:
      - should be an informative message;
      - debitCap must be supplemented with the amount calculated with discount;
      - it must be reflected in the discount history;
      - in procurementHistory, the discounted amount should also be reflected.
      Method return true if the tickets have been sold.
      Method return false if for some reason it was not sold. The reasons can be:
      - the tickets are sold out;
      - the user intends to purchase more tickets than are available;
      - other reasons.
     */
    public abstract boolean purchaseTicket(User user, long countOfTickets);
}
