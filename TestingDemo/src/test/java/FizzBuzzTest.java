import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    public void testFizzBuzz() {
        assertEquals("Fizzbuzz", fizzbuzz.fizzbuzz(15));
        assertEquals("Fizz", fizzbuzz.fizzbuzz(6));
        assertEquals("Buzz", fizzbuzz.fizzbuzz(10));
        assertEquals("7", fizzbuzz.fizzbuzz(7));
    }

}
