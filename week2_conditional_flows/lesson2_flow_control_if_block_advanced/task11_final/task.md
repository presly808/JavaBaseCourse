We are close to finishing week2 and be confident with `if` blocks from the moment on:

Your final task is to calculate a flight ticket price considering the following:
```
int currentDay; // from 1 to 31
int currentMonth; // from 1 to 12
int flightDay; // from 1 to 31
int flightMonth; // from 1 to 12
int weekDay; // from 1 to 7
String destination; // Can be one of London, Kyiv, Barcelone
```
All input data variables can affect the final price. Let's figure out how exactly:

* if you buy a ticket
  * before 40 days of a flight, discount = 20%
  * before 20 days of a flight, discount = 10%
* If you buy a ticket
  * on Tuesday, Wednesday, and Saturday -> you get an additional discount 10%
* However, the total discount can not be more than 25%

Original price to destination cities:
Kyiv - 200
London - 400
Barcelona - 300

There are some test cases of how input data will correlate with the result:

println "Your ticket to Barcelona on 22/12 costs 250."

To ease your life here is a pattern `Your ticket to <city> on <day>/<month> costs <finalPrice>."`
