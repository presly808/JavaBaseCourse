My congratulation that you passed the lesson about printing to console.\
It is time to understand what variables are.

Let's imagine you want to create a coffee machine that needs to know:
- How much money has been put
- What type of coffee you chose
- Status whether a drink is ready to be taken
- Additional sugar was included

Implying to data that is stored in coffee box machine and further operations on them

Hence, programming is not only playing with the console but also manipulating the different types of data.\
I mean **create, set, read** operations.

In Java, it will have the following syntax:
- declare variable -> `<type> <name>;`
  - `int chosenNumber;`
  - `String coffeeName;`
  - `double deposit;`
  - `boolean sugarIncluded;`
- set value to variable or assigning -> `<name> = <value>;`
  - `chosenNumber = 5;`
  - `coffeeName = "Americano";`
  - `deposit = 12.5;`
  - `sugarIncluded = true;`
- read -> `<name>`
  - `System.out.println(chosenNumber);`
  - `System.out.print(coffeeName);`
  - `System.out.print(deposit);`
  - `System.out.print(sugarIncluded);`
  - ```
        double rest; // decalarition
        double americanoPrice = 5; // declaration and set value in one operation
        rest = deposit - americanoPrice; // read variables, substract them, assign to `rest` variable 
        System.out.print(rest); // read value of rest variable and pass to the method `print(...)`
    ```
- declare and set in one line `<type> <name> = <value>;`. We usually do it this way, as it looks better and short
  - `int age = 25;`
  - `String name = "Oleg";`
  - `boolean sugarIncluded = true;`

Couple of leftovers you should keep in mind while working with variables
* "declare once, use everywhere".
* Name of variable has to be unique
* value should correspond to a type of variable
* there are operations over variables depending on the type
  * arithmetical on numbers `+ - * /`
  * logical on boolean `and, or, invert.`
  * comparison operations `<, <=, >, >=, ==, !=`
  * etc...
* Don't be afraid of remembering everything right away, as we will see more examples of the hints above in the next lessons