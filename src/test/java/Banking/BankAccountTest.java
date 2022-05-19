package Banking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    @DisplayName("Checking variable assignments from constructor methods are not null")
    void checkingVariablesExist(){
        var ba = new BankAccount("Patrick", 69.69);
        assertNotNull(ba);
        assertNotNull(ba.getName());
        assertNotNull(ba.getBalance());
    }

    @Test
    @DisplayName("Checking variable assignments from constructor methods are not accurate")
    void checkingVariablesAccuracy(){
        var ba = new BankAccount("Patrick", 69.69);
        assertEquals("Patrick", ba.getName());
        assertEquals(69.69, ba.getBalance());
    }

}