import frogger.*;

public class test2 {
    public static void main(String[] args) {
        // Road occupancy status (true = occupied, false = free)
        boolean[] roadStatus = {false, false, true, false, false};

        Road road = new Road(roadStatus);
        Records records = new Records();

        FroggerID id = new FroggerID("Suldee", "Inherism", "1234567890", "12345", "StateX", "M");

        // Create Frogger at position 0
        Frogger frogger = new Frogger(road, 0, records, id);

        System.out.println("Initial position: " + frogger.getPosition());

        // Try to move forward (to position 1)
        boolean movedForward = frogger.move(true);
        System.out.println("Moved forward? " + movedForward);
        System.out.println("New position: " + frogger.getPosition());

        // Try to move forward again (to position 2 - occupied, should fail)
        movedForward = frogger.move(true);
        System.out.println("Moved forward again? " + movedForward);
        System.out.println("Position remains: " + frogger.getPosition());

        // Try to move backward (to position -1 - invalid, should fail)
        boolean movedBack = frogger.move(false);
        System.out.println("Moved backward? " + movedBack);
        System.out.println("Position remains: " + frogger.getPosition());

        // Try to add record
        boolean recordAdded = frogger.recordMyself();
        System.out.println("Record added? " + recordAdded);

        // Try to add the record again (should fail)
        boolean recordAddedAgain = frogger.recordMyself();
        System.out.println("Record added again? " + recordAddedAgain);

        // Print all records
        System.out.println("All records:");
        for (FroggerID r : records.getAllRecords()) {
            System.out.println(r);
        }
    }
}
