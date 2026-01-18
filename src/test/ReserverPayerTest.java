package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.ReserverPayer;

public class ReserverPayerTest {
    @Test
    void testPayerName() {
        // Name updated to "Dua"
        ReserverPayer p = new ReserverPayer("Dua", 5000.0);
        assertEquals("Dua", p.getPayerName());
    }

    @Test
    void testPayerBalance() {
        // Keeping balance 5000.0 to match your Main.java
        ReserverPayer p = new ReserverPayer("Dua", 5000.0);
        assertEquals(5000.0, p.getBalance());
    }
}