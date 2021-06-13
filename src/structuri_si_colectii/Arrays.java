package structuri_si_colectii;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        System.out.println(" --1-- ");
        int[] x = reprezenareVector();

        System.out.println(" --2-- ");
        citreVector(); //de testat in Intellij

        System.out.println(" --3-- ");
        int[] v = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        afisareVector(x);

        System.out.println(" --4-- ");
        sumaArray(x);

        System.out.println(" --5-- ");
        produsArray(x);

        System.out.println(" --6-- ");
        mediaArray(x);

        System.out.println(" --7-- ");
        componentePozNeg(x);
    }

    //1
    public static int[] reprezenareVector() {
        int[] dataArray = new int[50];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = -250 + (int) (Math.random() * ((250 - (-250)) + 1));
            System.out.print(dataArray[i] + ", ");
        }
        return dataArray;
    }

    //2
    public static void citreVector() {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print(" Introduceti dimensiunea sirului: ");
        int a = scan.nextInt();
        System.out.print(" Introduceti elemantele sirului: ");
        int[] v = new int[a];
        for (int i = 0; i < v.length; i++) {
            v[i] = scan.nextInt();
        }
        System.out.print("Ati introdus urmatorul sir: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.print(" format din: " + a + " elemnte");
    }


    //3
    public static void afisareVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
    }

    //4
    public static void sumaArray(int[] v) {
        int sum = 0;
        for (int i : v) {
            sum += i;
        }
        System.out.println("Suma elementelor sirului este: " + sum);
    }

    //5
    public static void produsArray(int[] v) {
        double prod = 1;
        for (int i : v) {
            prod *= i;
        }
        System.out.println("Produsul elementelor sirului este: " + prod);
    }

    //6
    public static void mediaArray(int[] v) {
        int sum = 0;
        double media = 0;
        for (int i : v) {
            sum += i;
        }
        media = sum / v.length;
        System.out.println("Media elementelor sirului este: " + media);
        //System.out.println("v.length este: " + v.length);
    }

    //7
    public static void componentePozNeg(int[] v) {
        int countPozElement = 0;
        int countNegElement = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                countNegElement++;
            } else {
                countPozElement++;
            }
        }
        System.out.println("Elementele negative din sir sunt: " + countNegElement + ", Elementele pozitive din sir sunt: " + countPozElement);
    }
}
