import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void test() {
    Assert.assertEquals("value", Task.removeBrackets("{value}"));
  }

  @Test
  public void test1() {
    Assert.assertEquals("cccc", Task.removeBrackets("cccc"));
  }

  @Test
  public void test2() {
    Assert.assertEquals("{cccc", Task.removeBrackets("{cccc"));
  }

  @Test
  public void test3() {
    Assert.assertEquals("cccc}", Task.removeBrackets("cccc}"));
  }

  @Test
  public void test4() {
    Assert.assertEquals("", Task.removeBrackets("{}"));
  }

  @Test
  public void test5() {
    Assert.assertEquals("", Task.removeBrackets(""));
  }
}