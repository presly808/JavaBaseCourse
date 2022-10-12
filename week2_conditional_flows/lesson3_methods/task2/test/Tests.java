import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;

public class Tests extends OutputRedirectionParentTest {
  @Test
  public void sum() {
    Assert.assertEquals(6, Task.sum(1,2,3));
  }

  @Test
  public void divide() {
    Assert.assertEquals(3.0, Task.divide(6, 2), 0.1);
  }

  @Test
  public void getName() {
    Assert.assertEquals("Ivan", Task.getName());
  }

  @Test
  public void isNumberEven() {
    Assert.assertEquals(true, Task.isNumberEven(4));
  }

  @Test
  public void isNumberNotEven() {
    Assert.assertEquals(false, Task.isNumberEven(5));
  }

  @Test
  public void printHoy() {
    Task.printSomething();
    Assert.assertEquals("Message\n", baos.toString());
  }

  @Test
  public void printName() {
    Task.printName("Hey");
    Assert.assertEquals("Hey\n", baos.toString());
  }
}