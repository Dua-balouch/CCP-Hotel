package main;

public class Main {
    public static void main(String[] args) {
        
        // Name: Dua, Payer balance: 5000.0
        ReserverPayer payer = new ReserverPayer("Dua", 5000.0);
        
        // Room Type updated: Price changed to 3500.0
        RoomType roomType = new RoomType("Executive Suite", 3500.0);
        
        // Room Number updated to 101
        Room myRoom = new Room(101);

        System.out.println("DB Hotel Management System"); 
        System.out.println("---------------------------");
        System.out.println("Reserver Name: " + payer.getPayerName());
        System.out.println("Hotel Name: DB Hotel"); 
        System.out.println("Room Number: " + myRoom.getNumber());
        System.out.println("Room Type: " + roomType.getKind());
        System.out.println("Total Cost: " + roomType.getCost());
        System.out.println("---------------------------");
    }
}
