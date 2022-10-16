What if a task has no main method. It is enough for us to check, but not always enough for you to visualize.

Hence, you can add `public static void main(String[] args)` by yourself 

Let's see some example:

```java
public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }
}
```
 
If you add such method to visualizer you will see nothing as there is no start point of the application (`main` method).

The next step is to a main method and call sum with some test data for visualizer.

```java
public class Main {

    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 55;
        
        int res = sum(num1, num2);
        
        // or 
        int res2 = sum(1,1);
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
}
```