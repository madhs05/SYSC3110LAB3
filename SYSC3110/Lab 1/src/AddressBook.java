import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        AddressBook book = new AddressBook();

        BuddyInfo homer = new BuddyInfo("Homer", "9 Windwing Drive", "8712779999");
        BuddyInfo marge = new BuddyInfo("Marge", "9 Windwing WAYYYY", "8712778888");
        BuddyInfo someone = new BuddyInfo("someone", "9 Willow Drive", "8398");
        book.addBuddy(homer);
        book.addBuddy(marge);


        System.out.println("Address book contains:");
        for (BuddyInfo buddy : book.getBuddies()) {
            System.out.println(buddy.getName() + " - " + buddy.getAddress() + " - " + buddy.getPhone_number());
        }

        book.removeBuddy(homer);

        System.out.println("\nAfter removing Homer:");
        for (BuddyInfo buddy : book.getBuddies()) {
            System.out.println(buddy.getName() + " - " + buddy.getAddress() + " - " + buddy.getPhone_number());
        }

        book.removeBuddy(marge);
        book.addBuddy(someone);

        System.out.println("\nAfter removing Marge and adding someone:");
        for (BuddyInfo buddy : book.getBuddies()) {
            System.out.println(buddy.getName() + " - " + buddy.getAddress() + " - " + buddy.getPhone_number());
        }
        System.out.println("Hello Buddy");







    }
}
