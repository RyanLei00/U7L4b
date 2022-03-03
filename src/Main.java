import java.util.ArrayList;
import java.util.Scanner;

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
         */

        System.out.println("Test 1: ");
        Address addressTest1 = new Address("123", "Main", "Springfield", "NY", 11002);
        Address addressTest2 = new Address("123", "Main", "Springfield", "NY", 12305);
        Package test = new Package(addressTest1, addressTest2, 25, 12, 5, 10);
        System.out.println("From: " + addressTest1.toString());
        System.out.println("To: " + addressTest2.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(test));
        System.out.println("-------------------------------------");

        System.out.println("Test 2: ");
        Address addressTest3 = new Address("123", "Main", "Springfield", "NE", 68503);
        Address addressTest4 = new Address("123", "Main", "Springfield", "NE", 68825);
        System.out.println("From: " + addressTest3.toString());
        System.out.println("To: " + addressTest4.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest3, addressTest4, 39));
        System.out.println("-------------------------------------");

        System.out.println("Test 3: ");
        Address addressTest5 = new Address("123 Main, Springfield, MO 63130");
        Address addressTest6 = new Address("123 Main, Springfield, MO 64029");
        Address addressTest7 = new Address(addressTest6);
        System.out.println("From: " + addressTest5.toString());
        System.out.println("To: " + addressTest7.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest5.getZipcode(), addressTest4.getZipcode(), 15));
        System.out.println("-------------------------------------");

        System.out.println("Test 4: ");
        Address addressTest8 = new Address("123", "Main", "Springfield", "NE", 68503);
        Address addressTest9 = new Address("123", "Main", "Springfield", "NE", 68825);
        System.out.println("From: " + addressTest8.toString());
        System.out.println("To: " + addressTest9.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest8, addressTest9, 48));
        System.out.println("-------------------------------------");


        System.out.println("Test 5: ");
        Address addressTest10 = new Address("123", "Main", "Springfield", "NE", 68503);
        Address addressTest11 = new Address("123", "Main", "Springfield", "FL", 33018);
        System.out.println("From: " + addressTest10.toString());
        System.out.println("To: " + addressTest11.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(addressTest10, addressTest11, 39));
        System.out.println("-------------------------------------");

        System.out.println("User Test:");
        Scanner testScan = new Scanner(System.in);
        System.out.println("What is the weight of the package?");
        int weight = testScan.nextInt();
        System.out.println("What is the length of the package?");
        int l = testScan.nextInt();
        System.out.println("What is the width of the package?");
        int w = testScan.nextInt();
        System.out.println("What is the height of the package?");
        int h = testScan.nextInt();
        System.out.println("What is your street number?");
        String streetNum = testScan.nextLine();
        System.out.println("What is your street name?");
        String streetName = testScan.nextLine();
        System.out.println("What is your apartment number (type n/a if you don't have one)?");
        String aptNum = testScan.nextLine();
        System.out.println("What is your city?");
        String city = testScan.nextLine();
        System.out.println("What is your state?");
        String state = testScan.nextLine();
        System.out.println("What is your zipcode?");
        int zipcode = testScan.nextInt();

    }
}
