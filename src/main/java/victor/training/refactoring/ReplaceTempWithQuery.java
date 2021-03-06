package victor.training.refactoring;

public class ReplaceTempWithQuery {

    private int quantity;
    private double itemPrice;

    public ReplaceTempWithQuery(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }


    public double computePrice() {
        double basePrice = quantity * itemPrice;
        if (quantity > 10)
            return basePrice * 0.95;
        else
            return computeNormalPrice(basePrice);
    }

    private double computeNormalPrice(double basePrice) {
        if (basePrice > 1000) return basePrice * 0.95;
        else return basePrice * 0.98;
    }

    public int computeFidelityPoints() {
        return (int) (quantity * itemPrice / 2);
    }
}
