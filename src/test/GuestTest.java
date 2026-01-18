package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Guest;

public class GuestTest {
    @Test
    void testGuest() {
        // Name updated to "Dua" to match Main.java
        Guest g = new Guest("Dua", "0435");
        assertEquals("Dua", g.getName());
    }

    @Test
    void testGuestContact() {
        // Contact remains "0300" as requested
        Guest g = new Guest("Dua", "0435");
        assertEquals("0435", g.getContact());
    }
}