public class BuddyInfo {
    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public BuddyInfo() {
        this("Unknown", "Unknown Address", "000-000-0000");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuddyInfo buddy = new BuddyInfo("Homer", "9 Windwinnng Drive", "8712779999");
        System.out.println("Hello " + buddy.getName());
        System.out.println("My friend "+buddy.getName()+" lives on "+buddy.getAddress()+ " and his phone number is "+ buddy.getPhone_number() );
    }
}