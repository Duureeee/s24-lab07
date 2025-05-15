package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record using FroggerID.
     *
     * @param id FroggerID object
     * @return false if record already exists, else true
     */
    public boolean addRecord(FroggerID id) {
        if (records.contains(id)) {
            return false;
        }
        records.add(id);
        return true;
    }

    public List<FroggerID> getAllRecords() {
        return new ArrayList<>(records); // Defensive copy
    }

    public boolean addRecord(String firstName, String lastName, String phoneNumber, String zipCode, String state,
            String gender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRecord'");
    }
}
