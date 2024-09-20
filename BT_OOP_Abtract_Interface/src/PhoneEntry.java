
public class PhoneEntry {
    String name;
    String phone;

    public PhoneEntry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.phone;
    }
}
