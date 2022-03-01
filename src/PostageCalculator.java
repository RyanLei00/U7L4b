public class PostageCalculator {

    public static double calculatePostage(int zip1, int zip2, double weight){
        double price = 3.75;
        if(weight > 40){
            price += 40 * 10 * 0.05;
            price += (weight - 40) * 10 * 0.1;
        }
        else {
            price += weight * 10 * 0.05;
        }
        String zipFirst = "" + zip1;
        String zipSecond = "" + zip2;
        int zipOne = Integer.parseInt(zipFirst.substring(0, 3));
        int zipTwo = Integer.parseInt(zipSecond.substring(0, 3));
        price += Math.abs(zipOne - zipTwo) / 100.0;
        return price;
    }

    public static double calculatePostage(Address address1, Address address2, double weight){
        double price = 3.75;
        if(weight > 40){
            price += 40 * 10 * 0.05;
            price += (weight - 40) * 10 * 0.1;
        }
        else {
            price += weight * 10 * 0.05;
        }
        int zipOne = address1.getZipcode();
        int zipTwo = address2.getZipcode();
        price += Math.abs(zipOne - zipTwo) / 100.0;
        return price;
    }

    public static double calculatePostage(Package Package){
        double price = 3.75;
        double weight = Package.getWeight();
        if(Package.getCombined() > 36) {
            price += (Package.getCombined() - 36) * 0.10;
        }
        if(weight > 40){
            price += 40 * 10 * 0.05;
            price += (weight - 40) * 10 * 0.1;
        }
        else {
            price += weight * 10 * 0.05;
        }
        int zipOne = Package.getOrigin().getZipcode();
        int zipTwo = Package.getDestination().getZipcode();
        price += Math.abs(zipOne - zipTwo) / 100.0;
        return price;
    }
}
