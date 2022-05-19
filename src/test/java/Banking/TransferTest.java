package Banking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferTest {

    BankAccount patrick = new BankAccount("Patrick", 5000.01);
    BankAccount matt = new BankAccount("Matt", 1_000_000.69);
    Transfer t = new Transfer(patrick, matt, 100);

    @Test
    @DisplayName("Testing transfer instantiation")
    void checkingInstantiation(){
        assertNotNull(t);
    }

    @Test
    @DisplayName("Checking transfer sender and receiver")
    void checkingSender(){
        assertEquals("Patrick",t.getSender().getName());
    }

    @Test
    @DisplayName("Checking transfer sender and receiver")
    void checkingReceiver(){
        assertEquals("Matt",t.getReceiver().getName());
    }

    @Test
    @DisplayName("Checking the progress of the transfer")
    void checkingTransferProgress(){
        double preTransferCombinedBalance= t.getSender().getBalance()+t.getReceiver().getBalance();
        t.send();
        double postTransferCombinedBalance= t.getSender().getBalance()+t.getReceiver().getBalance();
        assertEquals(preTransferCombinedBalance, postTransferCombinedBalance);

    }
}