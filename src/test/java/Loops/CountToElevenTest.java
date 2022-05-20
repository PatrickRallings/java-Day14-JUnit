package Loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountToElevenTest {
    @Test
    @DisplayName("Makes sure the output counts to 11.0 when starting at 9.0")
    void checkCountingFromNine() {
        assertEquals("9.0\n10.0\n11.0\n", CountToEleven.loop(9.0));
    }
    @Test
    @DisplayName("Checking counting when beginning from 0")
    void checkCountingFromZero() {
        assertEquals("0.0\n1.0\n2.0\n3.0\n4.0\n5.0\n6.0\n7.0\n8.0\n9.0\n10.0\n11.0\n", CountToEleven.loop(0));
    }
    @Test
    @DisplayName("Checks counting output when a number with a decimal value (case: 8.3) is used")
    void checkCountingFromDecimal() {
        assertEquals("8.3\n9.3\n10.3\n", CountToEleven.loop(8.3));
    }
}