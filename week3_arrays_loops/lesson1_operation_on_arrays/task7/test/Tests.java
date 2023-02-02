import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(Parameterized.class)
public class Tests {

  public static double calculateTotalPrice(int price, int quantities, int discount) {
    int priceNoDisc = price * quantities;
    return priceNoDisc - (priceNoDisc * (discount * 0.01));
  }

  public static Object[] dataArray3ProductsNoDiscount(){

    String[] products = {"Milk", "Bread", "Eggs"};
    int[] prices = {30, 10, 20};
    int[] count = {1, 2, 3};
    int[] discount = {0, 0, 0};
    boolean premium = false;

    return generateTestData(products, prices, count, discount, premium);
  }

  public static Object[] dataArrayDiffSize(){

    String[] products = {"Milk", "Bread", "Eggs", "Beer", "Oranges"};
    int[] prices = {30, 10, 20};
    int[] count = {1, 2, 3};
    int[] discount = {0, 0, 0};
    boolean premium = false;

    return new Object[]{products, prices, count, discount, premium, "Input Data Arrays are not the same size"};
  }

  public static Object[] dataArrayMoreThan4Items(){

    String[] products = {"Milk", "Bread", "Eggs", "Beer", "Oranges"};
    int[] prices = {30, 10, 20, 10, 10};
    int[] count = {1, 2, 3, 8, 7};
    int[] discount = {0, 0, 0, 0, 0};
    boolean premium = false;

    return new Object[]{products, prices, count, discount, premium, "Input Arrays has size more than 4"};
  }

  private static Object[] generateTestData(String[] products, int[] prices, int[] count, int[] discount, boolean premium) {
    List<String> results = IntStream.range(0, products.length).mapToObj(index -> {
      double price = calculateTotalPrice(prices[index], count[index], discount[index]);
      return String.format("Name %s, Price %s, Quantities %s, Discount %s, Total %s",
              products[index], prices[index], count[index], discount[index],
              price);
    }).collect(Collectors.toList());

    double totalPrice = IntStream.range(0, products.length)
            .mapToDouble(index -> calculateTotalPrice(prices[index], count[index], discount[index])).sum();

    double priceWithDiscount = totalPrice - (totalPrice * (premium ? 0.1 : 0.0));

    return new Object[]{products, prices, count, discount, premium, "Final prices with discount is " + priceWithDiscount};
  }

  public static Object[] dataArray3ProductsDiscountNoPremium(){

    String[] products = {"Milk", "Bread", "Eggs"};
    int[] prices = {10, 10, 10};
    int[] count = {1, 1, 1};
    int[] discount = {10, 10, 10};
    boolean premium = false;

    return generateTestData(products, prices, count, discount, premium);
  }

  public static Object[] dataArray3ProductsNoDiscountButPremium(){

    String[] products = {"Milk", "Bread", "Eggs"};
    int[] prices = {5, 5, 10};
    int[] count = {1, 1, 1};
    int[] discount = {0, 0, 0};
    boolean premium = true;

    return generateTestData(products, prices, count, discount, premium);
  }


  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            dataArray3ProductsNoDiscount(),
            dataArray3ProductsDiscountNoPremium(),
            dataArray3ProductsNoDiscountButPremium(),
            dataArrayDiffSize(),
            dataArrayMoreThan4Items()
    });
  }

  String[] products;
  int[] prices;
  int[] count;
  int[] discount;
  boolean premium;
  String expected;

  public Tests(String[] products, int[] prices, int[] count, int[] discount, boolean premium, String expected) {
    this.products = products;
    this.prices = prices;
    this.count = count;
    this.discount = discount;
    this.premium = premium;
    this.expected = expected;
  }

  @Test
  public void tests() {
    String actual = Task.prepareReceipt(products, count, prices, discount, premium);
    System.out.println(String.format("prepareReceipt(%s,%s,%s,%s,%s) -> %s",
            Arrays.toString(products), Arrays.toString(count), Arrays.toString(prices),
            Arrays.toString(discount), premium, expected));
    Assert.assertEquals(String.format("prepareReceipt(%s,%s,%s,%s,%s) -> %s",
            Arrays.toString(products), Arrays.toString(count), Arrays.toString(prices),
            Arrays.toString(discount), premium, expected
    ), expected, actual);
  }
}