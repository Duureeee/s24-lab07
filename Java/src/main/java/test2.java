import frogger.*;

public class test2 {
    public static void main(String[] args) {
        // Зам дээрх зайны байдал (true = битүү, false = сул)
        boolean[] roadStatus = {false, false, true, false, false};

        Road road = new Road(roadStatus);
        Records records = new Records();

        FroggerID id = new FroggerID("Suldee", "Inherism", "1234567890", "12345", "StateX", "M");

        // Frogger-г 0 байрлал дээр үүсгэж байна
        Frogger frogger = new Frogger(road, 0, records, id);

        System.out.println("Эхний байрлал: " + frogger.getPosition());

        // Урагш хөдөлгөөн оролдоно (байрлал 1 рүү)
        boolean movedForward = frogger.move(true);
        System.out.println("Урагш хөдөлсөн эсэх: " + movedForward);
        System.out.println("Шинэ байрлал: " + frogger.getPosition());

        // Урагшаа дахин хөдөлж оролд (байрлал 2 - битүү учир амжилтгүй)
        movedForward = frogger.move(true);
        System.out.println("Урагш дахин хөдөлсөн эсэх: " + movedForward);
        System.out.println("Байрлал хэвээр: " + frogger.getPosition());

        // Буцах хөдөлгөөн оролдоно (байрлал -1 рүү, хүчинтэй биш учир амжилтгүй)
        boolean movedBack = frogger.move(false);
        System.out.println("Буцах хөдөлсөн эсэх: " + movedBack);
        System.out.println("Байрлал хэвээр: " + frogger.getPosition());

        // Record бүртгэх оролдлого
        boolean recordAdded = frogger.recordMyself();
        System.out.println("Record нэмэгдсэн эсэх: " + recordAdded);

        // Давтан бүртгэх оролдлого (давхардах учраас false буцах ёстой)
        boolean recordAddedAgain = frogger.recordMyself();
        System.out.println("Давтан record нэмэгдсэн эсэх: " + recordAddedAgain);

        // Бүх record-уудыг хэвлэх
        System.out.println("Бүх бүртгэлүүд:");
        for (FroggerID r : records.getAllRecords()) {
            System.out.println(r);
        }
    }
}