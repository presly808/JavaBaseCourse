Oh, I forgot to give you one intuition hint explaining why we need a variable.

Let's assume World without variables.

```
0.05;
760;
4;

System.out.println((760 * 4) - ((760 * 4) * 0.05));
```

So it is too unclear—just some numbers and operations without concrete business logic.

Version 1
```
double discountPercent = 0.05;
int productPrice = 760;
int countOfProducts = 4;

System.out.println((productPrice * countOfProducts) - ((productPrice * countOfProducts) * discountPercent));
```

Now each value has a name that makes our program readable and understandable.

But still, we can make code shorter and not do work two times when we can do it once

Version 2
```
double discountPercent = 0.05;
int productPrice = 760;
int countOfProducts = 4;

int totalPrice = productPrice * countOfProducts;

System.out.println((totalPrice) - (totalPrice * discountPercent));
```

Version 3 Giving a name to the final operation
```
double discountPercent = 0.05;
int productPrice = 760;
int countOfProducts = 4;

int totalPrice = productPrice * countOfProducts;
int totalPriceWithDiscount = (totalPrice) - (totalPrice * discountPercent);

System.out.println(totalPriceWithDiscount);
```

Please use it as your coding bible further.