import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class AssertionsTest {

    @Before
    public void messageBefore() {
        System.out.println("Message is displayed BEFORE every test...");
    }

    @After
    public void messageAfter() {
        System.out.println("Message is displayed AFTER every test...");
    }

    @BeforeClass
    static public void messageBeforeAnyTest() {
        System.out.println("====================================");
        System.out.println("Message is displayed BEFORE ANY test... ");
        System.out.println("====================================");
    }

    @AfterClass
    static public void messageAfterAllTests() {
        System.out.println("====================================");
        System.out.println("Message is displayed AFTER ALL tests... ");
        System.out.println("====================================");
    }

    @Test
    public void testAddOperation() {
        System.out.println("Testing <add>...");
        int a = 3, b = 20;
        assertEquals(23, a+b);
    }

    @Test
    public void testMatcherIs() {
        System.out.println("Testing <is>...");
        int a = 1, b = 1;
        assertThat(a, is(b));
    }

    @Test
    public void testMatcherAnyOf() {
        System.out.println("Testing <anyOf>...");
        int a = 1, b = 1, c = 2;
        assertThat(a, anyOf(is(b), is(c)));
    }

    @Test
    public void testMatcherAllOf() {
        System.out.println("Testing <allOf>...");
        int a = 1, b = 1, c = 1;
        assertThat(a, allOf(is(b), is(c)));
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void testExpectedIndexOutOfBoundsException() {
        System.out.println("Testing <expected exception IndexOutOfBoundsException>...");
        ArrayList arrayList = new ArrayList();
        arrayList.get(1);
    }

    @Test (expected=ArithmeticException.class)
    public void testExpectedArithmeticException() {
        System.out.println("Testing <expected exception ArithmeticException>...");
        int a = 10;
        int result = a/0;
    }

    @Test (expected=FileNotFoundException.class)
    public void testExpectedFileNotFoundException() throws FileNotFoundException {
        System.out.println("Testing <expected exception FileNotFoundException>...");
        File file = new File("tdd.txt");
        FileReader fr = new FileReader(file);
    }
}
