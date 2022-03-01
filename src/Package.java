public class Package {
/*
The Package class is comprised of 2 Address objects (an origin and a destination).
The Package also has a weight.
The weight should be represented as a double (2.4 pounds).
A package cannot weigh less than a tenth of a pound.
The Package class should have accessors for all of its fields.
 */

    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double height;
    private double width;

    public Package(Address origin, Address destination, double weight, double length, double height, double width) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public double getCombined(){ return length + width + height;}
}

