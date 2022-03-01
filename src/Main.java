public class Main {
    public static void main(String[] args) {
        /*
Generate some addresses, build some objects, and output the cost of shipping.
Make sure your output clearly states all of the necessary information about the
package.
Create a user interface that allows the user to enter information about a single
package to calculate the cost
Allow the user to simulate some number of packages. Generate addresses in a
realistic way (the key here is the zip codes) and calculate the shipping cost of all
the packages in the simulation
Use an ArrayList to store a list of Packages that you generate.
For this simulation, make the addresses domestic (US only)

Accounting for Oversized Packages
Adjust the Package class so that it includes dimensions (height, length, width).
A package cannot be less than 2 inches on any side.
Any package that is a combined 36 inches or less follows the same rules of calculation.
****Any package that exceeds a combined 36 inches will cost an additional 10 cents per inch.****
Additionally, packages that are more than 40 pounds will be charged 10 cents per tenth of a pound over the 40 pound limit.
         */

        Address addressTest1 = new Address("123", "Main", "Springfield", "NY", 11002);
        Address addressTest2 = new Address("123", "Main", "Springfield", "NY", 12305);

        Package test = new Package(addressTest1, addressTest2, 25, 12, 5, 10);
        System.out.println("From: " + addressTest1.toString());
        System.out.println("To: " + addressTest2.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(test));
        System.out.println("-------------------------------------");

        Address addressTest3 = new Address("123", "Main", "Springfield", "NE", 68503);
        Address addressTest4 = new Address("123", "Main", "Springfield", "NE", 68825);
        System.out.println("From: " + addressTest3.toString());
        System.out.println("To: " + addressTest4.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest3, addressTest4, 39));
        System.out.println("-------------------------------------");

        Address addressTest5 = new Address("123 Main, Springfield, MO 63130");
        Address addressTest6 = new Address("123 Main, Springfield, MO 64029");
        Address addressTest7 = new Address(addressTest6);
        System.out.println("From: " + addressTest5.toString());
        System.out.println("To: " + addressTest7.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest5.getZipcode(), addressTest4.getZipcode(), 15));
    }
}
