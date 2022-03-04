import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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
        System.out.println();

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
        testScan.nextLine();
        System.out.println("Which state are you sending this package to? (Ex: NY, CA)");
        String state = testScan.nextLine();

        FileReader fileReader = new FileReader("src/zip.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        ArrayList<Zip> zip = new ArrayList<Zip>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] infoFromTxt = line.split(" ");

            String txtState = infoFromTxt[0];
            int minZip = Integer.parseInt(infoFromTxt[1]);
            int maxZip = Integer.parseInt(infoFromTxt[2]);

            Zip newPackageLoc = new Zip(txtState, minZip, maxZip);
            zip.add(newPackageLoc);
        }
        bufferedReader.close();

        int packageMaxZip = 0;
        int packageMinZip = 0;

        for (int i = 0; i < zip.size(); i++) {
            if (zip.get(i).getState().equals(state)) {
                packageMaxZip = zip.get(i).getMaxZip();
                packageMinZip = zip.get(i).getMinZip();
            }
        }

        int newZip = (int) (Math.random() * (packageMaxZip - packageMinZip)) + packageMinZip;
        int newZip2 = (int) (Math.random() * (packageMaxZip - packageMinZip)) + packageMinZip;


        Address userAddTest = new Address("123", "Main", "Springfield", state, newZip);
        Address compAddTest = new Address("123", "Main", "Springfield", state, newZip2);

        ArrayList<Package> packages = new ArrayList<Package>();

        Package userPacTest = new Package(userAddTest, compAddTest, weight, l, h, w);
        packages.add(userPacTest);

        System.out.println("From: " + userAddTest.toString());
        System.out.println("To: " + compAddTest.toString());
        System.out.println("$" + PostageCalculator.calculatePostage(userPacTest));

    }
}