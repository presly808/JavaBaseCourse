I do believe in Visualization. The more you visualize, the more you understand.

Flowcharts are not the only ways to present a code with visual components.

We also can run a program step by step, seeing:
* how a program is being executed
* what is happening with the data on each step

I am going to introduce a web tool that can visualize your code.
https://cscircles.cemc.uwaterloo.ca/java_visualize/
If this site stops working, please let me know. I will update the description and the link.\

How to copy/paste code to the tool and understand the flow

Steps:
* Copy the code
* Open the link https://cscircles.cemc.uwaterloo.ca/java_visualize/
* Paste the code
* Press `Visualize Execution` button
* Press Forward and notice what happens with your data
* Video Instruction https://www.youtube.com/watch?v=NvOiw1OrE9s

Let's visualize the previous tasks:

Task1:

```java
public class Main {
   public static void main(String[] args) {
      int a = 12;
      int b = 43;
      
      int sum = a + b;
      
      if (sum % 2 == 0) {
          System.out.println("Result is even");
      } else {
          System.out.println("Result is odd");
      }
   }
}
```

Task1 with Scanner and input:

```java
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int heartBeatsPerMinute = sc.nextInt();
      int age = sc.nextInt();

      if (heartBeatsPerMinute >= 60 && heartBeatsPerMinute <= 100) {
         System.out.println("Your heart rate is in normal zone");
      }
      
      System.out.printf("heartBeatsPerMinute = %s, age = %s", heartBeatsPerMinute, age);
   }
}
```

Task3: -> Scanner is a bit specific for the visualizer.

So, we can just get rid of scanner usage. We take the  example above and clean up a bit
```java
public class Main {
   public static void main(String[] args) {
      
      int heartBeatsPerMinute = 88;

      if (heartBeatsPerMinute >= 60 && heartBeatsPerMinute <= 100) {
         System.out.println("Your heart rate is in normal zone");
      }
      
      System.out.printf("heartBeatsPerMinute = %s", heartBeatsPerMinute);
   }
}
```

From then on, **flowcharts** and **code visualizer** are your best friends in this learning adventure.

In the future, we will learn how to use an embedded debugger in your Intellij IDE. (More advanced approach)