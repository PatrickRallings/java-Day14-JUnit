import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTablesTest {
    @Test
    @DisplayName("Checking for proper multiplication (output) of 10")
    void checkMultiplicationOfTen() {
        assertEquals("10.0\n20.0\n30.0\n40.0\n50.0\n60.0\n70.0\n80.0\n90.0\n100.0\n", MultiplicationTables.loop(10));
    }
    @Test
    @DisplayName("Checking for use case of zero")
    void checkMultiplicationOfZero() {
        assertEquals("0.0\n0.0\n0.0\n0.0\n0.0\n0.0\n0.0\n0.0\n0.0\n0.0\n", MultiplicationTables.loop(0));
    }
    @Test
    @DisplayName("Checking for using a negative number (case: -1")
    void checkMultiplicationWithNegative() {
        assertEquals("-1.0\n-2.0\n-3.0\n-4.0\n-5.0\n-6.0\n-7.0\n-8.0\n-9.0\n-10.0\n", MultiplicationTables.loop(-1));
    }
}