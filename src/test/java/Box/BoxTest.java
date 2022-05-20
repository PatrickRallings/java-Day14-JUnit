package Box;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    Box b;
    Box b2;
    @BeforeEach
    void setUp(){
        b = new Box(10,10);
    }

    @Test
    @DisplayName("Checking instantiation")
    void checkingInstantiation(){
        assertNotNull(b);
    }

    @Test
    @DisplayName("Checking isEqual method (Case: true)")
    void checkingIsEqualTrue(){
        b2 = new Box(10,10);
        assertTrue(b.isEqual(b2));
    }

    @Test
    @DisplayName("Checking isEqual method (Case: false)")
    void checkingIsEqualFalse(){
        b2 = new Box(10,15);
        assertTrue(!b.isEqual(b2));
    }

    @Test
    @DisplayName("Checking for successful duplication (height)")
    void checkingDuplicationHeight(){
        assertEquals(b.getHeight(), b.duplicate().getHeight());
    }

    @Test
    @DisplayName("Checking for successful duplication (width)")
    void checkingDuplicationWidth(){
        assertEquals(b.getWidth(), b.duplicate().getWidth());
    }
}