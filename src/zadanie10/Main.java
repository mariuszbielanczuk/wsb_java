package zadanie10;

public class Main {
    public static void main(String[] args) {

        double[] prices = {1.99, 5.99, 12.99, 49.99, 199.99};
        double totalPrice = 0.0;
        double totalPriceDicounted = 0.0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
            totalPriceDicounted += priceAfterDiscount(prices[i], i*10);
        }
        System.out.printf("Total price = %f PLN%n",totalPrice);
        System.out.printf("Total price after discount %s = %s PLN",10,totalPriceDicounted);

    }

    private static double priceAfterDiscount(double price, int discountInPercent) {
        return price * (100 - discountInPercent) / 100;
    }
}
