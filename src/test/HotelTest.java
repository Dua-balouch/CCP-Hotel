
package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Hotel;

public class HotelTest {
    @Test
    void testHotelName() {
        // Updated to "DB Hotel"
        Hotel h = new Hotel("DB Hotel");
        assertEquals("DB Hotel", h.getHotelName());
    }

    @Test
    void testHotelNotNull() {
        // Updated to "DB Hotel"
        Hotel h = new Hotel("DB Hotel");
        assertNotNull(h.getHotelName());
    }
}