import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality(new FormalGreeting());
        assertEquals("Good evening", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality(new CasualGreeting());
        assertEquals("Goodday?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality(new IntimateGreeting());
        assertEquals("Hello darling!", greeter.greet());
    }

    @Test
    public void testSaysHelloBadly() {
        Greeter greeter = new Greeter();
        greeter.setFormality(new BadGreeting());
        assertEquals("<growls>", greeter.greet());
    }
}
