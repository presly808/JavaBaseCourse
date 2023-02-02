We are close to finishing week2 and be confident with `if` blocks from the moment on:

Your final task is to calculate a flight ticket price considering the following:
```
int year; // 2022
int currentDay; // from 1 to 28,29,30,31
int currentMonth; // from 1 to 12
int flightDay; // from 1 to 28,29,30,31
int flightMonth; // from 1 to 12
String destination; // Can be one of London, Kyiv, Barcelona
```
Read all input data using Scanner. Order matters.

All input data variables can affect the final price. Let's figure out how exactly:

* if you buy a ticket
  * before 40 days of a flight, discount = 20%
  * before 20 days of a flight, discount = 10%
* If you buy a ticket
  * on Tuesday, Wednesday, and Saturday -> you get an additional discount 10%
* However, the total discount can not be more than 25%

Original price to destination cities:
Kyiv - 300
London - 500
Barcelona - 430

Regarding validation -> use the approach that we have seen [here](course://week2_conditional_flows/lesson2_flow_control_if_block_advanced/task6):
* If city is not `Kyiv`, `London`, `Barcelona` -> println message `Destination is not supported` and break the program with `return`
* If currentMonth not in 1 or 12 OR (currentDay < 1 OR currentDay > daysInCurrentMonth) -> println message `Current Date invalid` and break the program with `return`
* If flightMonth not in 1 or 12 OR (flightDay < 1 OR flightDay > daysInFlightMonth) -> println message `Flight Date invalid` and break the program with `return`
* !!! I have declared some 

If you pass the validation, and calculate the price with a discount, the final message should be:
To ease your life here is a pattern `Your ticket to <city> on <day>/<month> costs <finalPrice>."`

println "Your ticket to Barcelona on 22/12 costs 250."
*** 
Here are some test data:

```
year,   currentDay,   currentMonth,   flightDay,  flightMonth,  destination   Message
2022,   20,           3,              25,         3,            "London",     "Your ticket to London on 25/3 costs 500"
2022,   20,           3,              16,         4,            "Kyiv",       "Your ticket to Kyiv on 16/4 costs 240",
2022,   20,           3,              16,         33,           "Barcelona",  "Flight Date invalid",
2022,   20,           3,              30,         4,            "Kyiv",       "Your ticket to Kyiv on 30/4 costs 225",
```

Last hints:
* Raw a raw version without validation, just price
* Run Tests and see what test cases pass and what fails
* Then Add validation
* Then Add Discount logic
* Visualizer + Checking will help you to troubleshoot and complete the logic