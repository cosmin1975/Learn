package methods;

public class Ex1MethodsIntermediar {

    //Ex.1.Metode-Intermediar. Scrie un program care returneaza true daca suma, diferenta, inmultirea sau imparitirea
    // a doua numere primite este divizibila cu 7.

    public static void main(String[] args) {
        int x = 49;
        int y = 7;
        System.out.println(divCuSapte(x, y));
    }

    public static Boolean divCuSapte(int x, int y) {
        Boolean valid = false;
        double suma = x + y;
        double dif = x - y;
        double inmultire = x * y;
        double impartire = x / y;
        if (suma % 7 == 0 && dif % 7 == 0 && inmultire % 7 == 0 && impartire % 7 == 0) {
            valid = true;
        }
        return valid;
    }
}
