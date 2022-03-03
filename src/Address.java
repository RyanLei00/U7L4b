public class Address {

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

    public Address(String address)
    {
        boolean hasApt = true;
        if(address.indexOf("Apt") == -1)
        {
            hasApt = false;
            aptNum = null;
        }
        streetNum = address.substring(0,address.indexOf(" "));
        address = address.substring(address.indexOf(" ") + 1);
        if(hasApt)
        {
            streetName = address.substring(0,address.indexOf("Apt") -1);
            address = address.substring(address.indexOf("Apt"));
            aptNum = address.substring(0,address.indexOf(","));
            address = address.substring(address.indexOf(",") + 2);
        }
        else
        {
            streetName = address.substring(0,address.indexOf(","));
            address = address.substring(address.indexOf(",") + 2);
        }

        city = address.substring(0,address.indexOf(","));
        address = address.substring(address.indexOf(",") + 2);
        state = address.substring(0,address.indexOf(" "));
        address = address.substring(address.indexOf(" ") + 1);
        zipcode = Integer.parseInt(address);
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
        print += getStreetNum() + " ";
        print += getStreetName() + " ";
        if(aptNum != null) {
            print += getAptNum() + " ";
        }
        print += getCity() + " ";
        print += getState() + " ";
        print += getZipcode() + " ";
        return print;
    }
}
