package methods;

public class Ex5Methods {

    //Ex.5 Scrie un program care contine o metoda, avand ca functie verificarea unei parole (un sir de caractere introdus de la tastatura.
    //Parola este corespunzatoare daca:
    // -este compusa doar din litere si din cifre
    // -are minim 8 caractere si maxim 32
    // -are cel putin doua cifre.


    public static void main(String[] args) {

        String parola = "g2sld1d1";
        System.out.println(password(parola));

    }

    public static boolean password(String s) {
        Boolean valid = false;
        int counter = 0;
        int letter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                counter++;
            }
            if (Character.isAlphabetic(s.charAt(i))) {
                letter++;
            }
            if (counter >= 2 && letter > 0 && s.length() >= 8 &&s.length()<=32){
                valid = true;
            }
        }
        return valid;
    }
}

