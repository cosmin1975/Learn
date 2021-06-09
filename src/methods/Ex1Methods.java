package methods;

public class Ex1Methods {
    public static void main(String[] args) {
        //Ex. Scrie un program care returneaza (printr-o metoda) caracterul din mijloc al unui sir.
        //Daca numarul elementelor din sir este impar, va exista un singur caracter, ex: pentru "Ana"->n
        //Daca numarul elementelor din sir este par, vor exista doua caractere, ex: pentru "Dana"->an

        String a = caracterMijloc("CostInela");
        String b = caracterMijloc("Costin");

        System.out.println("Caracterul din mijloc este: " + a);
        System.out.println("Caracterle din mijloc sunt: " + b);

    }

    public static String caracterMijloc(String name) {

        int pozitieCaracter, lungime;

        if (name.length() % 2 == 0) {
            pozitieCaracter = name.length() / 2 - 1;
            lungime = 2;
        } else {
            pozitieCaracter = name.length() / 2;
            lungime = 1;
        }

        return name.substring(pozitieCaracter, pozitieCaracter + lungime);
    }

}
