import com.artcode.OutputRedirectionParentTest;
import org.junit.*;

import java.io.ByteArrayInputStream;

public class Tests extends OutputRedirectionParentTest {

    @Test
    public void testWhenSpeedIncorrect() {

        System.setIn(new ByteArrayInputStream("-2".getBytes()));

        Task.main(new String[0]);

        String actual = baos.toString().trim();

        Assert.assertEquals("Speed is incorrect", actual);
    }

    @Test
    public void testNormalSpeed() {
        // put your test here
        System.setIn(new ByteArrayInputStream("45".getBytes()));

        Task.main(new String[0]);

        String actual = baos.toString().trim();

        Assert.assertEquals("Best speed for driving in a city", actual);
    }

    @Test
    public void testOutOfSpeedLimit() {
        // put your test here
        System.setIn(new ByteArrayInputStream("80".getBytes()));

        Task.main(new String[0]);

        String actual = baos.toString().trim();

        Assert.assertEquals("You are dangerous!", actual);
    }

    @Test
    public void testCloseToSpeedLimit() {
        // put your test here
        System.setIn(new ByteArrayInputStream("59".getBytes()));

        Task.main(new String[0]);

        String actual = baos.toString().trim();

        Assert.assertEquals("You are very close to getting a ticket", actual);
    }
}