import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressbook;

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null)
            addressbook.add( buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null)
            addressbook.remove( buddy);
    }

    public static void main(String[] args) {
        system.out.println("Address Book");
    }
}
