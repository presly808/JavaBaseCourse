Welcome to new course section called **flow control (`if` block)**

As always, we start with a problem to present a solution. 

Let's assume our program should have instruction that are being ran on specific condition.

Syntax:
```
// expression that gives value of boolean type
// if true -> we run the commands inside the block
if (<condition>) {
    // instuctions
}
```
```
// condition should have value of boolean type (true or false)
// so 8 < 10 gives true...
if (8 < 10) {
    // logic if condition is true
}

// invalid
if (5) {

}

// valid
if (true) {

}

// valid
if (true && false) {

}

// invalid
if (8 * 12) {

}
```

Examples:

Print `We are open!` if hour is between `8` and `18`
Hence, we do some action only if condition has been met
```
int hour;
// we only print message if hour == 12, otherwise we do nothing
if (hour == 12) {
  System.out.println("We are having lunch!");
}
```
***
Let's back to the code to review more examples



      