package practise;

// Room class
class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isBooked;

    // Constructor of room class
    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
    }

    // Getters and Setters function of room class
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }
    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean booked) { this.isBooked = booked; }
}

// Guest class to store guest information
class Guest {
    private String name;
    private String contact;
    private int guestId;

    public Guest(String name, String contact, int guestId) {
        this.name = name;
        this.contact = contact;
        this.guestId = guestId;
    }

    // Getters of guest class
    public String getName() { return name; }
    public String getContact() { return contact; }
    public int getGuestId() { return guestId; }
}

// Booking class to manage reservations
class Booking {
    private Room room;
    private Guest guest;
    private String checkInDate;
    private String checkOutDate;

    public Booking(Room room, Guest guest, String checkInDate, String checkOutDate) {
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        room.setBooked(true);
    }

    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Check-in: " + checkInDate);
        System.out.println("Check-out: " + checkOutDate);
        System.out.println("Total Price: $" + room.getPrice());
    }
}

// Hotel class to manage rooms and bookings
class Hotel {
    private String hotelName;
    private Room[] rooms;
    private Booking[] bookings;
    private int roomCount;
    private int bookingCount;

    public Hotel(String hotelName, int totalRooms) {
        this.hotelName = hotelName;
        this.rooms = new Room[totalRooms];
        this.bookings = new Booking[totalRooms];
        this.roomCount = 0;
        this.bookingCount = 0;
    }

    // Add a room to the hotel
    public void addRoom(int roomNumber, String roomType, double price) {
        if (roomCount < rooms.length) {
            rooms[roomCount] = new Room(roomNumber, roomType, price);
            roomCount++;
            System.out.println("Room " + roomNumber + " added successfully!");
        } else {
            System.out.println("Hotel is full! Cannot add more rooms.");
        }
    }

    // Book a room
    public void bookRoom(int roomNumber, Guest guest, String checkIn, String checkOut) {
        for (Room room : rooms) {
            if (room != null && room.getRoomNumber() == roomNumber && !room.isBooked()) {
                bookings[bookingCount] = new Booking(room, guest, checkIn, checkOut);
                bookingCount++;
                System.out.println("Room booked successfully!");
                return;
            }
        }
        System.out.println("Room not available or doesn't exist!");
    }

    // Display all available rooms
    public void displayAvailableRooms() {
        System.out.println("Available Rooms in " + hotelName + ":");
        for (Room room : rooms) {
            if (room != null && !room.isBooked()) {
                System.out.println("Room " + room.getRoomNumber() + " - " +
                        room.getRoomType() + " - $" + room.getPrice());
            }
        }
    }
}

// Main class to test the system
public class HotelManagementSystem {
    public static void main(String[] args) {
        // Create a hotel object
        Hotel hotel = new Hotel("Grand Hotel", 5);

        // This function is use to add room
        hotel.addRoom(101, "Single", 100.0);
        hotel.addRoom(102, "Double", 150.0);
        hotel.addRoom(103, "Suite", 250.0);

        // Display available rooms
        hotel.displayAvailableRooms();

        // Create a guest object
        Guest guest = new Guest("Adarsh singh", "123-456-7890", 1);

        // Book a room
        hotel.bookRoom(101, guest, "2024-12-09", "2025-01-4");

        // Display available rooms after booking
        System.out.println("\nAfter booking:");
        hotel.displayAvailableRooms();
    }
}
