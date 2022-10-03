Now it is your turn to create variables and write a simple program called "PrintCenter"

Let's assume a print center should receive the following information from the client:
* pageSize -> possible values "A1","A2","A3","A4" ...
* count -> how many pages will be printed
* sentByEmail -> indicator whether PDF has been sent via email

PrintCenter knows about pagePrice. I would suggest creating a variable for that as well.

Once you get all variables, it is time to calculate the total price and give a receipt to the client.

We will expect the following message.
```
Thanks for coming. Total amount is <totalPrice> for <count> pages of size <pageSize>. Price per page is <pagePrice>. Received from email: true
```

<div class="hint">
  Please ensure you will not move the cursor to a new line
</div>

<div class="hint">
  Use `print(...) instead of `println(...)`
</div>

<div class="hint">
  Create receipt message using String concatenation (`+`)
</div>

<div class="hint">
  Check the task to see the differences between your and expected results. 
  So you will be able to change the code to pass the tests
</div>