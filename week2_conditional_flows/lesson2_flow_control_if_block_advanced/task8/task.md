If you come so far, your motivation is really strong.

Let's complicate a bit our logic. No worries, we do it gradually.

Our target is still nested block, although with deepness 3.
```
  if () {
    if () {
      if () {
        ...
      }
    }
  }
```

Let's review the following task (Program that decides if we can give a loan to a client):

We got input data:
```
int yearIncome;
boolean hasSuccessLoansHistoryInBank;
boolean hasCriminalRecords;
boolean hasRequiredDocuments;
```

A bank can give a loan if client meets the following conditions:
* (yearIncome >= 30 AND hasSuccessLoansHistoryInBank) OR
* (yearIncome >= 30 AND NOT hasSuccessLoansHistoryInBank AND hasRequiredDocuments) OR
* (yearIncome < 30 AND NOT hasCriminalRecords AND hasRequiredDocuments)

other way to define a task:

* yearIncome >= 30
  * hasSuccessLoansHistoryInBank - LOAN
  * NOT hasSuccessLoansHistoryInBank 
    * hasRequiredDocuments LOAN
    * NOT hasRequiredDocuments No Loan
* yearIncome < 30
  * NOT hasCriminalRecords 
    * hasRequiredDocuments - Loan
  * hasCriminalRecords - No Loan

In other cases we should reject a request on a loan
In success cases we print "Loan", otherwise "No Loan"

Let's transform our conditions to a **flowchart**:

![img.png](img.png)

After all material you have seen, please code the task







