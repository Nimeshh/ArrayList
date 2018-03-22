package practice;

public class Information {
    private String Name;
    private String LastName;
    private String Street;
    private String City;
    private String State;
    private String ZipCode;
    private String PhoneNumber;

    public Information(String name, String lastName, String street, String city, String state,
                       String zipCode, String phoneNumber) {
        Name = name;
        LastName = lastName;
        Street = street;
        City = city;
        State = state;
        ZipCode = zipCode;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public static Information info(String name, String lastName, String street, String city
                                    , String state, String zipCode, String phoneNumber) {
        Information information = new Information(name, lastName, street, city, state, zipCode, phoneNumber);
        return information;
    }
}
