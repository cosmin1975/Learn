package methods;

import java.util.Scanner;

public class Ex2Methods {
    public static void main(String[] args) {
        //Ex2. Scrie o metoda care nmara cate cifre se afla intr-un sir de caractere.

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de caractere: ");
        String str = scanner.nextLine();*/
        String str = "L12mvnfi23mvbh5";
        System.out.println(contorCifreDinString(str));

    }

    public static int contorCifreDinString(String str) {

        int contorCifre = 0;
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                contorCifre++;
            }
        }
        return contorCifre;
    }

}
