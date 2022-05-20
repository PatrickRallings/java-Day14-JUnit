package Banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount ba;
    @BeforeEach
    void setUp(){
        ba = new BankAccount("Patrick", 69.69);
    }
    @Test
    @DisplayName("Checking variable assignments from constructor methods are not null")
    void checkingVariablesExist(){
        assertNotNull(ba);
        assertNotNull(ba.getName());
    }

    @Test
    @DisplayName("Checking variable assignments from constructor methods are not accurate")
    void checkingVariablesAccuracy(){
        assertEquals("Patrick", ba.getName());
        assertEquals(69.69, ba.getBalance());
    }

}