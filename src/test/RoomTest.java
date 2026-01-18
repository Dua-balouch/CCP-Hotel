package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Room;

public class RoomTest {
    @Test
    void testRoomNumber() {
        // Updated to 101 to match Main.java
        Room r = new Room(101);
        assertEquals(101, r.getNumber()); 
    }

    @Test
    void testRoomOccupancy() {
        // Updated to 101
        Room r = new Room(101);
        assertFalse(r.isOccupied());
        r.setOccupied(true);
        assertTrue(r.isOccupied());
    }
}