public class Task {
    public static String prepareReceipt(String[] products, int[] quantities, int[] prices,
                                     int[] discounts, boolean hasPremiumCard) {

        if (products.length != quantities.length
                || quantities.length != prices.length
                || prices.length != discounts.length) {
            return "Input Data Arrays are not the same size";
        }

        if (products.length > 4) {
            return "Input Arrays has size more than 4";
        }

        if (products.length == 0) {
            return "Input Arrays are empty";
        }

        double totalPrice = 0;

        if (products.length > 0) {
            int index = 0;
            double price = calculateTotalPrice(prices[index], quantities[index], discounts[index]);
            totalPrice += price;
        }

        if (products.length > 1) {
            int index = 1;
            double price = calculateTotalPrice(prices[index], quantities[index], discounts[index]);
            totalPrice += price;
        }

        if (products.length > 2) {
            int index = 2;
            double price = calculateTotalPrice(prices[index], quantities[index], discounts[index]);
            totalPrice += price;
        }

        if (products.length > 3) {
            int index = 3;
            double price = calculateTotalPrice(prices[index], quantities[index], discounts[index]);
            totalPrice += price;
        }

        double priceWithDiscount = totalPrice - (totalPrice * (hasPremiumCard ? 0.1 : 0));

        return "Final prices with discount is " + priceWithDiscount;
    }

    public static double calculateTotalPrice(int price, int quantities, int discount) {
        int priceNoDisc = price * quantities;
        return priceNoDisc - (priceNoDisc * (discount * 0.01));
    }
}