import java.util.Date;

public class House {
    // properties
    int sizeInSqFt;
    int numberOfRooms;
    int garageSize;
    Human owner;
    String newItem;

    // constructor
    public House(int sizeInSqFt, int numberOfRooms, int garageSize, Human owner) {
        this.sizeInSqFt = sizeInSqFt;
        this.numberOfRooms = numberOfRooms;
        this.garageSize = garageSize;
        this.owner = owner;
    }

    // methods
    public Human getOwner() {
        return this.owner;
    }

    public void Build (String item) {
        System.out.println("You just built " + item + " for your house.");
    }
}