package methods;

import java.util.Scanner;

public class Ex3MethodsAdvanced {
    //Ex.3 Metode-Avansat. Creeaza un program care afiseaza primele x cifre dupa virgula ale valorii lui PI,
    // unde x va avea urmatoarele valori: 2, 7, 12, 20.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cate zecimale din numarul PI vreti sa vizualizati: ");
        int x = scanner.nextInt();
        countPiDecimals(x);
    }

    public static void countPiDecimals(int x) {
        double b = Math.PI % 3;
        int counter = 0;

        while (counter < x) {
            b *= 10;
            counter++;
        }
        System.out.println((long) b);
    }
}
