package Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p;
    @BeforeEach
    void setUp(){
        p = new Product("Keyboards", 99.99, 3);
    }
    @Test
    @DisplayName("Checking the existence of variable used as constructor parameter: name")
    void checkingExistenceName() {
        assertNotNull(p.getName());
    }
    @Test
    @DisplayName("Checking the accuracy of variable used as constructor parameter: name")
    void checkingAccuracyName() {
        assertEquals("Keyboards", p.getName());
    }
    @Test
    @DisplayName("Checking the accuracy of variable used as constructor parameter: cost")
    void checkingAccuracyCost() {
        assertEquals(99.99, p.getCost());
    }
    @Test
    @DisplayName("Checking the accuracy of variable used as constructor parameter: quantity")
    void checkingAccuracyQuantity() {
        assertEquals(3, p.getQuantity());
    }
    @Test
    @DisplayName("Constructor Case: Name created with zero-char")
    void checkInstanceName() {
        var n = new Product("", 99.99, 3);
        assertEquals("", n.getName());
    }
    @Test
    @DisplayName("Constructor Case: Product cost is zero")
    void checkInstanceZeroCost() {
        var c = new Product("Keyboards", 0.00, 3);
        assertEquals(0.00, c.getCost());
    }
    @Test
    @DisplayName("Constructor Case: Product quantity is zero")
    void checkInstanceZeroQuantity() {
        var c = new Product("Keyboards", 99.99, 0);
        assertEquals(0.00, c.getQuantity());
    }
}