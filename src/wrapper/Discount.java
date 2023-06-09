package wrapper;

public class Discount {

    /*
    @Description: The scope of the discount
     */
    private String purpose;

    /*
    @Description: The value in percentage.
    Example: 10.0 or 8.5 ...
    Percentage can be zero or null. It can be a discount for a defined purpose, but the discount value is not yet defined.
     */
    private Double percentage;

    public Discount(String purpose, Double percentage) {
        this.purpose = purpose;
        this.percentage = percentage;
    }
}
