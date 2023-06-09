package wrapper;

import java.util.ArrayList;
import java.util.List;

/*
  @Description:
  It defines the discounts that can be applied for certain purposes.
  Respond to the request if the discount can be granted to the user.
 */
public class DiscountService {
    private List<Discount> discounts;

    public DiscountService() {
        discounts = new ArrayList<>();
        Discount discount100 = new Discount("100 amount", 2.0);
        Discount discount500 = new Discount("500 amount", 10.0);
        Discount discount1000 = new Discount("1000 amount", 30.0);
        discounts.addAll(List.of(discount100, discount500, discount1000));
    }

    /*
    @Description: if the amount is close to 100, 500 or 1000 with 10% approximation
     a discount will be offered
     */
    public Discount getDiscount(Double amount) {
        if (almostEqual(amount, 100.0, 10)) {
            return discounts.get(0);
        } else if (almostEqual(amount, 500.0, 50)) {
            return discounts.get(1);
        } else if (almostEqual(amount, 1000.0, 100)) {
            return discounts.get(2);
        }
        return null;
    }

    /*
    @Description: compare that sequence of doubles are all "approximately equal"
     */
    private static boolean almostEqual(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }
}
