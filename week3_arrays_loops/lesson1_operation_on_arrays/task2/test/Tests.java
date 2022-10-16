import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void firstIndex(){
    Assert.assertEquals(0, Task.getFirstIndex());
  }

  @Test
  public void lastIndex(){
    Assert.assertEquals(8, Task.getLastIndexOfArray(new int[9]));
  }

  @Test
  public void lastIndex2(){
    Assert.assertEquals(1, Task.getLastIndexOfArray(new int[2]));
  }

  @Test
  public void size(){
    Assert.assertEquals(2, Task.getArraySize(new char[2]));
  }

  @Test
  public void size1(){
    Assert.assertEquals(0, Task.getArraySize(new char[]{}));
  }

  @Test
  public void createIntArray(){
    Assert.assertArrayEquals(new int[8], Task.createIntArray(8));
  }

  @Test
  public void createStrArray(){
    Assert.assertArrayEquals(new String[]{"1", "2"}, Task.createArray("1", "2"));
  }

  @Test
  public void createStrArray2(){
    Assert.assertArrayEquals(new String[]{"x", "y"}, Task.createArray("x", "y"));
  }
}