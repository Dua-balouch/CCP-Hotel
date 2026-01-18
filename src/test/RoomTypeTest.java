package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RoomType;

public class RoomTypeTest {
    @Test
    void testRoomKind() {
        // Updated to "Executive Suite"
        RoomType rt = new RoomType("Executive Suite", 3500.0);
        assertEquals("Executive Suite", rt.getKind());
    }

    @Test
    void testRoomPrice() {
        // Price updated to 3500.0 to match Main.java
        RoomType rt = new RoomType("Executive Suite", 3500.0);
        assertEquals(3500.0, rt.getCost()); 
    }
}