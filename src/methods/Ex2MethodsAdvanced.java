package methods;

public class Ex2MethodsAdvanced {
    //Ex.2 Metode-Avansat. Scrie cate un program care afiseaza caracterele dintre dpua caractere precizate pe
    // diecare linie afisindu-se maxim 8 caractere, avand inter ele cate un spatiu.

    public static void main(String[] args) {
        String s = "abcdefghijklmnoprst";
        printCharacters(s, 'b', 'm', 8);

    }

    public static void printCharacters(String str, char ch1, char ch2, int numberPerLine) {
        int currentNumber = numberPerLine;
        int beginningIndex = str.indexOf(ch1) + 1;
        int endingIndex = str.indexOf(ch2);

        for (int i = beginningIndex; i < endingIndex; i++) {
            System.out.print(str.charAt(i));

            if (currentNumber > 1) {
                currentNumber--;
            } else {
                System.out.println("");
                currentNumber = numberPerLine;
            }
        }

    }
}
