package Product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    @DisplayName("Checking the constructor's variable creation")
    void checkInstanceKeyboard() {
        var p = new Product("Keyboards", 99.99, 3);
        assertNotNull(p.getName());
        assertEquals("Keyboards", p.getName());
        assertNotNull(p.getCost());
        assertEquals(99.99, p.getCost());
        assertNotNull(p.getQuantity());
        assertEquals(3, p.getQuantity());
    }
    @Test
    @DisplayName("Constructor Case: Name created with zero-char")
    void checkInstanceName() {
        var n = new Product("", 99.99, 3);
        assertNotNull(n.getName());
        assertEquals("", n.getName());
    }
    @Test
    @DisplayName("Constructor Case: Product cost is zero")
    void checkInstanceZeroCost() {
        var c = new Product("Keyboards", 0.00, 3);
        assertNotNull(c.getCost());
        assertEquals(0.00, c.getCost());
    }
}