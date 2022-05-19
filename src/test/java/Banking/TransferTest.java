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

    @Test
    @DisplayName("Checking sender's balance has decreased by the transfer amount")
    void checkingSenderPostBalance(){
        double preTransferSenderBalance= t.getSender().getBalance();
        t.send();;
        assertEquals(preTransferSenderBalance - t.getAmount(), t.getSender().getBalance());
    }

    @Test
    @DisplayName("Checking receiver's balance has increased by the transfer amount")
    void checkingReceiverPostBalance(){
        double preTransferReceiverBalance= t.getReceiver().getBalance();
        t.send();;
        assertEquals(preTransferReceiverBalance + t.getAmount(), t.getReceiver().getBalance());
    }
}