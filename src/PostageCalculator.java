public class PostageCalculator {
    /*
The postage calculator is designed to figure out just how much it will cost to ship
a package.
The formula for determining the cost is as follows:
The base cost is $3.75.
Add 5 cents for each tenth of a pound.
Divide the difference in county codes by 100 and add that to calculate the final cost.
The county code is the first 3 digits of the zip code.

The PostageCalculator class is a static library with 3 different versions of the
calculatePostage() method.
You may include other methods as you see fit.
All versions of calculatePostage() should return the cost of sending the package as
a double.
One version of calculatePostage() should take in the 2 zip codes and the weight of
the package.
One version of calculatePostage() should take in the 2 addresses and the weight of
the package.
Once version of calculatePostage() should simply take in the package.
     */

    /*
    weight = 5
    50
        Math.abs(660 - 679) / 100.0;

     */

    public static double calculatePostage(int zip1, int zip2, double weight){
        double price = 3.75;
        price += weight * 10 * 0.05;
        String zipFirst = "" + zip1;
        String zipSecond = "" + zip2;
        int zipOne = Integer.parseInt(zipFirst.substring(0, 3));
        int zipTwo = Integer.parseInt(zipSecond.substring(0, 3));
        price += Math.abs(zipOne - zipTwo) / 100.0;
        return price;
    }

    public static double calculatePostage(Address address1, Address address2, double weight){

    }

    public static double calculatePostage(Package Package){

    }
}
