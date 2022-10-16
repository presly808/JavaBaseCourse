You have grown up. The moment came to write the application from scratch.

The only description will be available:

The program should calculate the days a user needs to gain/lose weight.

Input Data:

```
String name;
int currentWeight;
int desiredWeight;
int caloriesBurnPerDay;
int caloriesEatenPerDay;
```

Calculate how many days are needed to burn or gain kilos.

* Read data via Scanner. Order matters
* At the beginning, we should print to console input data. It helps with troubleshooting.
  * Pattern for printf: `"Input data. Name %s, currentWeight %s, desiredWeight %s, caloriesBurnPerDay %s, caloriesEatenPerDay %s\n"`
* We need to know whether a user wants to gain/lose weight. (Compare `currentWeight` and `desiredWeight`)
* Additionally check the current ration, if `caloriesBurnPerDay` is lower than `caloriesEatenPerDay`.
* See how to convert from calories to kilos with the formula  `kg = callories * 0.00013`

There are examples of what should you print depending on the input values.

```
Name, currentWeight, desiredWeight ,caloriesBurnPerDay, caloriesEatenPerDay, Expected Message
{"Bogdan", 78, 85, 2000, 5000, "You will reach the target in 26 days"},
// In this case, a person wants to gain weight, but his/her food ratio is about to lose weight
{"Oleg", 78, 85, 3000, 2000, "You are losing weight"},
{"Olesia", 60, 50, 2000, 1500, "You will reach the target in 38 days"},
// In this case, a person wants to lose weight, but his/her ration is about to gain weight
{"Ivanka", 55, 45, 1000, 3000, "You are gaining weight"},
```

Be patient, and write *flowchart*. You can visualize your application if it doesn't work as expected.