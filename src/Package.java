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

    public Package(Address origin, Address destination, double weight) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
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
}

