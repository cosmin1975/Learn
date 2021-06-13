package methods;

public class DifferentMethods {

    public static void main(String[] args) {
        // int a = 25;
        // int b = 37;
        // int c = 29;
        // int x = findMin(a,b,c);
        // double z = averageOfTreeNo(a,b,c);
        // String s = midCharOfAString("123456");
        // int nr = countVowels("mi-am dorit o masina, si acuma o am");
        // int nr1 = countWords("mi-am dorit o masina, si acuma o am");
        // System.out.println("Minimul este: " + x + ", iar media este: "+z);
        // System.out.println("Caracterul/caracterele din mijlocul stringului este/sunt: " + s);
        // System.out.println("Nmarul de vocale din sir este: " + nr);
        // System.out.println("Nmarul de cuvinte din sir este: " + nr1);
        // System.out.println("Suma cifrelor unui numar intreg este: " + sumIntNo(125));
        // pentNo(50);
        //  System.out.println(leapYear(1584));
        // print_Chars('a', 'z', 20);
        int i = 2;
        i = i++ + ++i;
        System.out.println(i);
        int j = 2;
        j = j++ * ++j;
        System.out.println(j);

    }

    //aflarea minimului dintre 3 numere
    public static int findMin(int x1, int x2, int x3) {
        return Math.min(Math.min(x1, x2), x3);
    }

    //media a 3 numere
    public static double averageOfTreeNo(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    //aflarea caracterului/caracterelor din mijlocul unui string
    public static String midCharOfAString(String str) {
        int counter = 0;
        int length;
        if (str.length() % 2 == 0) {
            counter = str.length() / 2 - 1;
            length = 2; // daca lungimea stringului este para, in mijloc se vor gasi 2 caractere
        } else {
            counter = str.length() / 2;
            length = 1;
        }
        return str.substring(counter, counter + length);
    }

    //metoda care numara vocalele dintr-un sir
    public static int countVowels(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

    //metoda care numara cuvintele dintr-un string
    public static int countWords(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter + 1;
    }

    //metoda care face suma cifrelor unui numar intreg
    public static int sumIntNo(int no) {
        int tmp;
        int sum = 0;
        while (no > 0) {
            tmp = no % 10;
            sum += tmp;
            no = no / 10;
        }
        return sum;
    }

    //metoda care afiseaza primele 50 de numere pentagonale
    public static void pentNo(int no) {
        int p = 0;
        System.out.println("primele 50 de numere pentagonale sunt: ");
        for (int i = 0; i < 50; i++) {
            p += 3 * i + 1;
            System.out.println(p);
        }
    }

    //Metoda care afiseaza daca un an este bisect
    public static boolean leapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leap = true;
        }
        return leap;
    }

    //Metoda care afiseaza carcterele dintre 2 caractere specificate
    public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
        System.out.print("\n");
    }
}
