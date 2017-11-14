import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Demonstrates how to test your JVM Application
 */
public class AppTest
{
    JavaApp classUnderTest;

    /**
     * Runs before each test
     */
    @Before
    public void setup()
    {
       classUnderTest = new JavaApp();
    }

    @Test
    public void testAppHasAGreeting()
    {
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
