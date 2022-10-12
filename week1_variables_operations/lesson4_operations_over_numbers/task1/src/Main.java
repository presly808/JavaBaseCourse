public class Main {
   public static void main(String[] args) {
      // just a reminder that we can declare a variable without setting value,
      // but usually, we don't do it in java
      int sum;

      int num1 = 5;
      int num2 = 10;
      sum = num1 + num2;

      System.out.println(sum);
      //you don't even need to create a variable if you use it only one time
      System.out.println(78 * 12);

      int count = 0;
      count = count + 1;
      System.out.println("Count=" + count);
      // or even shorter version when we read value do some action and save to rewrite
      count += 1; // shorter analog of `count = count + 1;`
      System.out.println("Count=" + count);
      // as you can guess, you can use it with other operations `-=, *=, /=, %=`
      count *= 2;
      System.out.println("Count=" + count);

      int bottles = 26;
      int boxSize = 5;

      // small task, how many boxes are needed to sort out 28 bottles if each box can contain five items;
      // the most logical way to divide `bottles/boxSize`

      int boxNum = bottles / boxSize;
      System.out.printf("boxNum = %s", boxNum);
      // Surprise, boxNum = 5, not 5.2
      // hence int / int = int
      int remainder = bottles % 5;
      System.out.println(" Rest=" + remainder);
      // it means that in the last box, we put one bottle

      // but int / double = double
      System.out.println(26 / 5.0); // 5.2
   }
}