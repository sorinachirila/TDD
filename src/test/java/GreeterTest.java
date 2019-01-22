import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void testGreeterSaysHelloToTheWorld() {
        Greeter greeter = new Greeter();
        String helloMsg = greeter.sayHello();
        assertThat(helloMsg, equalTo("Hello World!"));
    }
}
