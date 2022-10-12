I feel that you are bored by `if` blocks. It is necessary to keep our learning interesting. Hence we are moving our focus to a new topic.

So we will learn a bit about **function/procedure** in Java. It is called **method**.

You already use (**called**) them:

```
scanner.nextInt(); // accepts nothing, returns int value
scanner.nextBoolean(); // accepts nothing, returns boolean value
scanner.next(); // accepts nothing, returns String value

System.out.println(...); // accepts String value, returns nothing, but prints to console
System.out.printf(...); // accepts String value and other arguments, returns nothing, but prints to console
String.format(...); // accepts String and other arguments, returns formatted String value

Integer.toBinaryString(34); // accepts int value, return String value (Binary representation of int value) 
```

In other words, you called some methods but did not **declare**(create) them.
It is just like a reading variable, but not creating it.

From our perspective, a method is a black box that accepts something, does its work, and returns a result.
We don't know what exactly happens inside. Sometimes we don't need it. Just pass some data, and get results.

So we saved our time because there are already many **declared**(created) methods in Java.

Moreover, we can write(**declare**) our own **methods** to simplify our life.

Let's see examples of how methods can ease and beautify the code:

Note: Visualize every step we will go through

Example 1 (Code Duplication Problem):

```Java
  public class Main {
    public static void main(String[] args) {
        int priceInUsd = 100;
        double finalPriceInEur = 0;
        double discountHigh = 0.25;
        double discountMedium = 0.15;
        double discountNormal = 0.1;
        boolean isPremiumAccount = true;

        double finalPriceInEur = 0;

        if (priceInUsd > 100) {
            double finalPriceInUsd = priceInUsd - (price * discountHigh);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        } else if (priceInUsd > 50) {
            int finalPriceInUsd = priceInUsd - (priceInUsd * discountMedium);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        } else {
            int finalPriceInUsd = priceInUsd - (priceInUsd * discountNormal);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        }

        System.out.println("You final price is " + finalPrice);
    }
}
```

We do almost the same calculations. Only the discount is being changed.
Declare the method, but do not call it.

```Java
  public class Main {
    public static void main(String[] args) {
        int priceInUsd = 100;
        double eurInOneUSD = 1.03;
        double discountHigh = 0.25;
        double discountMedium = 0.15;
        double discountNormal = 0.1;
        boolean isPremiumAccount = true;

        double finalPriceInEur = 0;

        if (priceInUsd > 100) {
            double finalPriceInUsd = priceInUsd - (priceInUsd * discountHigh);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        } else if (price > 50) {
            double finalPriceInUsd = priceInUsd - (priceInUsd * discountMedium);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        } else {
            double finalPriceInUsd = priceInUsd - (priceInUsd * discountNormal);
            finalPriceInEur = finalPriceInUsd * eurInOneUSD;
        }

        System.out.println("You final price is " + finalPrice);
    }

    // declaration (creating) of the method
    // this method accepts three arguments (initialPrice, discount, currencyRate)
    //  and return totalPrice
    public static double calculatePriceWithDiscountAndCurrency(int initialPrice, double discount, double currencyRate) {
        double finalPriceWithoutDiscount = initialPrice - (initialPrice * discount);
        double finalPriceDiscountCurrency = finalPriceWithoutDiscount * currencyRate;
        return finalPriceDiscountCurrency;
    }
}
```

We declared the method, but we don't use(**call**) it.

Let's call the method.

```Java
  public class Main {
    public static void main(String[] args) {
        int priceInUsd = 100;
        double eurInOneUSD = 1.03;
        double discountHigh = 0.25;
        double discountMedium = 0.15;
        double discountNormal = 0.1;
        boolean isPremiumAccount = true;

        double finalPriceInEur = 0;

        if (priceInUsd > 100) {
            finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountHigh, eurInOneUSD);
        } else if (priceInUsd > 50) {
            finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountMedium, eurInOneUSD);
        } else {
            finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountNormal, eurInOneUSD);
        }

        System.out.println("You final price is " + finalPriceInEur);
    }

    // declaration (creating) of the method
    // this method accepts three arguments (initialPrice, discount, currencyRate)
    //  and return totalPrice
    public static double calculatePriceWithDiscountAndCurrency(int initialPrice, double discount, double currencyRate) {
        double finalPriceWithoutDiscount = initialPrice - (initialPrice * discount);
        double finalPriceDiscountCurrency = finalPriceWithoutDiscount * currencyRate;
        return finalPriceDiscountCurrency;
    }
}
```

Now we call the method that we declared in the previous step.

What we got:

* the lines of code were named (more readable code)
* the code got shorter (declared once, used many times)
    * we can relate to variable theory [link](course://week1_variables_operations/lesson2_variable/task6/task.md)
* Lifecycle
    * Declare
        * Create a method
    * Call
        * Use a created method
* Scope
    * You should have noticed during visualization that your method only sees the passed data. The black box can not see outside.

Example of Scope:

```Java
 public class Main {
    public static void main(String[] args) {
        int a = 23;
        int b = 11;
        int result = increment(a);
    }
    
    // accepts int number, does incrementation, and returns result (int)
    public static int increment(int number){
        int res = number + 1;
        // we can not access `b`
        // the next line will not be working. You can uncomment and visualize to see the compilation error
        // b = b + 1;
        return res;
    }
}
```

An example should incline you to thoughts about scope.
* where are we located?
* what do we see?
* inside a method, we can see only data that were passed
* main method calls other methods and can not access variables created inside.
    * interaction is performed through input data and data that are being returned
***

About Java Syntax (Method declaration):

```
// with one argument
public static <returnedType> <methodName> (<type> <argument>) {
  // actions
  return <value of returnedType>;
}
// without input data
public static <returnedType> <methodName> () {
  // actions
  return <value of returnedType>;
}
// without return. Void means that we return nothing
public static void <methodName> () {
  // actions
  return <value of returnedType>;
}
// without return, but two input arguments
public static void <methodName> (<type> <argument>, <type> <argument>) {
  // actions
}
// with the return, but two input arguments
public static <returnedType> <methodName> (<type> <argument>, <type> <argument>) {
  // actions
  return <value of returnedType>;
}
```

***
More examples of declaration and invocation (**calling**):

```Java
public class Main {

    // main is a method where our program starts
    public static void main(String[] args) {
        // invocation, calling
        int result1 = sum(23, 44);
        int result2 = sum(11, 66);

        printHello();
        String m1 = concat("Ivan", 35);
        String m2 = concat("Oleg", 28);
        String m3 = concat("Lubov", 22);
        printHello();
    }

    // Declaration
    //  input two numbers and return sum of input numbers
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // no input parameters, no return value
    public static void printHello() {
        System.out.println("Hello");
    }

    // two input parameters (name, age) -> return message String
    public static String concat(String name, int age) {
        return "Hello " + name + ". Your age is " + age;
    }
}
```

I hope you have pasted all the examples to the visualizer and were trying to understand each step.

We will do more exercises, be ready to get back to this page to refresh your knowledge.

***
