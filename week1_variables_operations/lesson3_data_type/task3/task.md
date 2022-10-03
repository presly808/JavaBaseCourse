Have you ever thought about what will be if we do arithmetical operations over different data types?

Here are some cases:
```
int a = 8;
double d = 10.0;
<?> res1 = a * d;

<?> res2 = d + 78f;

byte b = 2;
<?> res3 = b * 78;
```

Here are some rules to answer to such questions:

* remember about how java recognizes default type
  * `78 -> int`
  * `56.43 -> double`
* bigger type always wins
  * If we have case `byte + int = int`
  * `int * long = long`
  * `double / float = double`
  * `double + int = double`
* Considering the tips above, we can also put the smaller variable into a bigger one. It has the name "Upcasting" or "Widening Primitive Conversion"
  ```
    byte b = 12;
    short s = b;
    int i = s;
    long l = i;
    
    float f = 12f;
    
    double d = f;
    double d1 = i;
  
    // x store the code of `Z` (ASCII table)
    int x = 'Z';
  ```

Please fill the gaps based on your new knowledge.