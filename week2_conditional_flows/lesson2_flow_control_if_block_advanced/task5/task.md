You have been grown up. The moment came to write the application from the scratch . 

Only description will be available:

The program should calculate days a user needs to gain/loose the weight.

Input Data:

```
String name;
int currentWeight;
int desiredWeight;
int caloriesBurnPerDay;
int caloriesEatenPerDay;
```

Calculate how many days are needed to burnt or gained kilos.

* Read data via Scanner. Order matters
* At the beginning, we should print to console input data, it helps with troubleshoot.
  * Pattern for printf: `"Input data. Name %s, currentWeight %s, desiredWeight %s, caloriesBurnPerDay %s, caloriesEatenPerDay %s\n"`
* We need to know whether a user wants to gain/loose weight. (Compare `currentWeight` and `desiredWeight`)
* Additionally check the current ration, if `caloriesBurnPerDay` is lower than `caloriesEatenPerDay`.
* See how to convert from calories to kilos with the formula  `kg = callories * 0.00013`

There are examples what should you print depending on the input values

```
Name, currentWeight, desiredWeight ,caloriesBurnPerDay, caloriesEatenPerDay, Expected Message
{"Bogdan", 78, 85, 5000, 2000, "You will reach the target in 10"},
// In this case a person wants to gain weight, but his/her ration is about to loose weight
{"Oleg", 78, 85, 2000, 3000, "You are loosing weight"},  
{"Olesia", 60, 50, 1500, 2000, "You will reach the target in 51"},
// In this case a person wants to loose weight, but his/her ration is about to gain weight
{"Ivanka", 55, 45, 3000, 1000, "You are gaining weight"},
```

Be patient, write *flowchart*, you can visualize your application if it doesn't work as expected.