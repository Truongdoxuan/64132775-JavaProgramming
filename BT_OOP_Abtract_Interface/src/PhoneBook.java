// PhoneBook.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<PhoneEntry> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneEntry entry : PhoneList) {
            if (entry.name.equals(name)) {
                if (!entry.phone.contains(phone)) {
                    entry.phone += ": " + phone;
                }
                return;
            }
        }
        PhoneList.add(new PhoneEntry(name, phone));
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(entry -> entry.name.equals(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneEntry entry : PhoneList) {
            if (entry.name.equals(name)) {
                entry.phone = newphone;
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneEntry entry : PhoneList) {
            if (entry.name.equals(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, Comparator.comparing(entry -> entry.name));
    }

    public void displayAll() {
        if (PhoneList.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            for (PhoneEntry entry : PhoneList) {
                System.out.println(entry);
            }
        }
    }
}
