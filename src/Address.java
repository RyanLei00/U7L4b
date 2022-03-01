public class Address {
    /*
An Address is made up of the following:
The Street Number (remember that this could be a number like 101 or it could also
have a letter like 101A).
The Street Name
The Apartment Number (which should be optional)
The City
The State
The Zip Code (which should be exactly 5 numbers)

The Address class is going to need 3 constructors:
One that takes in the separate pieces of the address and assigns them to the proper
fields.
One that takes in an address object and copies its information into the fields.
One that takes in an address as a String, breaks up the information, and copies it into
the fields.

The Address class must have an accessor method for each of its fields.
The Address class must have a toString() that returns the address in the following
format:
Number Street Apt Number (optional), City, State Zip
1313 Mockingbird Lane Apt 6A, Springfield, MO 65123
1313 Mockingbird Lane, Springfield, MO 65123
The Address class must have a method that takes in an Address Object as a
parameter and compares it to the current object. It will return true if they are the
same and false if not.
     */

    private String address;
    private String streetNum;
    private String streetName;
    private String aptNum;
    private String city;
    private String state;
    private int zipcode;

    public Address(String streetNum, String streetName, String aptNum, String city, String state, int zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zipcode = zipCode;
    }

    public Address(String streetNum, String streetName, String city, String state, int zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipCode;
    }

    public Address(Address address)
    {
        this.streetNum = address.getStreetNum();
        this.streetName = address.getStreetName();
        this.aptNum = address.getAptNum();
        this.city = address.getCity();
        this.state = address.getState();
        this.zipcode = address.getZipcode();
    }

    public Address(String address){
        String[] a = address.split(",");
        city = a[1];
        streetNum = a[0].substring(0, a[0].indexOf(" "));
        streetName = a[0].substring(a[0].indexOf(" ") + 1);
        state = a[2].substring(0, a[2].indexOf(" "));
        zipcode = Integer.parseInt(a[2].substring(a[2].indexOf(" ") + 1));
    }

    public String getAddress() {
        return address;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String toString() {
        String print = "";
        print += getStreetNum();
        print += getStreetName();
        print += getAptNum();
        print += getCity();
        print += getState();
        print += getZipcode();
        return print;
    }
}
