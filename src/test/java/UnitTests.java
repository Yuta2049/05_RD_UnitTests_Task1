import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {


    @Test
    void concantenateWords() {

        assertEquals("onetwo", Utils.concantenateWords("one", "two"));
        assertEquals("onethree", Utils.concantenateWords("one", "three"));

    }

    @Test
    void concantenateWordsCorrectlyWorksWithNonLatinSymbols() {

        assertEquals("ОдинДва", Utils.concantenateWords("Один", "Два"));
        assertEquals("oneдва", Utils.concantenateWords("one", "два"));

    }

    @Test
    void concantenateWordsCorrectlyWorksWithEmptyString() {

        assertEquals("one", Utils.concantenateWords("one", ""));
        assertEquals("", Utils.concantenateWords("", ""));

    }

    @Test
    void concantenateWordsThrowsNPEIfStringIsNull() {

        assertThrows(NullPointerException.class, () -> Utils.concantenateWords("one", null));
        assertThrows(NullPointerException.class, () -> Utils.concantenateWords(null, "two"));
        assertThrows(NullPointerException.class, () -> Utils.concantenateWords(null, null));

    }

    @Test
    //@Disabled
    void testComputeFactorial() {

        assertEquals(1, Utils.computeFactorial(0), "Факториал 0");
        assertEquals(6, Utils.computeFactorial(3), "Факториал 3");
        assertEquals(24, Utils.computeFactorial(4), "Факториал 4");

    }

    @Test
     void testComputeFactorialThrowsIllegalArgumentExceptionWhenGetsNegativeNumber() {

        assertThrows(IllegalArgumentException.class, () -> Utils.computeFactorial(-3));
        assertThrows(IllegalArgumentException.class, () -> Utils.computeFactorial(-5));

    }

    @Test
    void testFactorialWithTimeout() {

        Random random = new Random();
        int number;
        do {
            number = random.nextInt();
        } while (number < 0);

        int ar[] = {number};

        assertTimeout(Duration.ofMillis(1000), () -> {
                    Utils.computeFactorial(ar[0]);
                },
                "Факториал числа: " + ar[0]);

    }

}
