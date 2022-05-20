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
    @DisplayName("Checking object, when instantiated, exists ")
    void checkingObjectExist(){
        assertNotNull(ba);
    }

    @Test
    @DisplayName("Checking the String name in object, when instantiated with argument, exists ")
    void checkingNameExist(){
        assertNotNull(ba.getName());
    }

    @Test
    @DisplayName("Checking accuracy of assigned name")
    void checkingNameAccuracy(){
        assertEquals("Patrick", ba.getName());
    }

    @Test
    @DisplayName("Checking accuracy of assigned initial balance")
    void checkingBalanceAccuracy(){
        assertEquals(69.69, ba.getBalance());
    }

}