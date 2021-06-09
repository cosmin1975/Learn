package input_output;

import java.util.Scanner;

public class ScanFromConsole {
    public static void main(String[] args) {

        boolean error = false;
        while (!error) {
            Scanner myObj = new Scanner(System.in);  // Creeaza un obiect de tip Scanner
            System.out.println("Enter username");
            String userName = myObj.nextLine();  // Citeste de la utilizator (tastatura)

            try {
                System.out.println("Enter your pin code:");
                int pinNumber = myObj.nextInt(); //se mai pot folosi nextDouble(), nextFloat(), nextBoolean() - true/false
                System.out.println("Username is: " + userName);  // Afiseaza datele citite
                System.out.println("Pin is: " + pinNumber);
                error = true;

            } catch (Exception e) {
                System.out.println("Pin is incorrect. Please introduce only integer numbers.");
            }

        }
    }

}
