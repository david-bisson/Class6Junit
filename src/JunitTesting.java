import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTesting {

    // Run once at the beginning of the test
    @Before
    public static void runOnceBeforeClass() {
        System.out.println("Before all");
    }

    // Run once at the end of the test
    @After
    public static void runOnceAfterClass() {
        System.out.println("After all");
    }

    // Run before each method
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - run before @Test method");
    }

    // Run after each method
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - run after @Test method");
    }


    @Test
    public void isXandYnotEquals() {
        int x = 1;
        int y = 7;

        Assertions.assertNotEquals(x, y);
        //        Assert.assertNotEquals(x, y);
    }

    @Test
    public void print_letter_c() {
        System.out.println("C");
    }

    @Test
    public void print_letter_b() {
        System.out.println("B");
    }

    @Test
    public void print_letter_a() {
        System.out.println("A");
    }
}
