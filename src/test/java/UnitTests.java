import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

public class UnitTests {


    @Test
    void concantenateWords() {
        //assertEquals(2, 1 + 1);

        assertEquals("onetwo", Utils.concantenateWords("one", "two"));
        assertEquals("one", Utils.concantenateWords("one", null));
        assertEquals("one", Utils.concantenateWords("one", ""));
        assertEquals("oneБУ", Utils.concantenateWords("one", "БУ"));

    }

    @Test
    void testComputeFactorial() {

        assertEquals(6, Utils.computeFactorial(3), "Факториал 3");
        assertEquals(24, Utils.computeFactorial(4), "Факториал 4");
        //assertEquals(2, 1 + 4);

        assertEquals("onetwo", Utils.concantenateWords("one", "two"));

    }


    @Test
    void testFactorialWithTimeout() {

        Random random = new Random();
        int number = 0;
        do {
            number = random.nextInt();
        } while (number < 0);

        System.out.println(number);

        int ar[] = {number};

        assertTimeout(Duration.ofMillis(1000), () -> {
            Utils.computeFactorial(ar[0]);
        });



    }


}
