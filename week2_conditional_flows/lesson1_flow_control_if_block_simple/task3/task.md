Frankly saying I have showed you only a small part of `if` block.

There are more capabilities with that block: 

We can add `else` block that will be executed when expression gives `false`

Example:

```
int hour = 12;
if (hour > 8 && hour < 18) {
   System.out.println("I am working");
} else { 
   // we get into this block if `hour > 8 && hour < 18` == false. 
   // Hour should not be in range from 8 till 18   
   System.out.println("I am having a rest");
}
```

In other words, you have two blocks that are connected with each other.

It is not over with syntax. There is a `else if` blocks as well

```
int hour = 12;
if (hour > 8 && hour < 18) {
   System.out.println("I am working");
} else if (hour > 13 && hour < 14) { 
   System.out.println("Lunch time");
} else if (hour > 19 && hour < 21) {
   System.out.println("Education Time");
} else { 
   // we get into this block if `hour > 8 && hour < 18` == false. 
   // Hour should not be in range from 8 till 18   
   System.out.println("I am having a rest");
}
```

* All blocks connected with each other, 
* if we get true in the first block we don't check the next conditions
* There is a strict order, from top to bottom
* We may get into `else` block only if the previous ones give `false`  

From moment on, we should be familiar with connected blocks and unconnected

I know that you may be confused how to choose if when we need:
* only single `if`
* couple `if` but unconnected
  * they don't depend on each other
  * we will check every condition for every block, even if we execute the first block 
* `if-else` connected
* or `if - else if -else`

Your decision will come from a business logic (task description).
We will see more examples to improve your code intuition