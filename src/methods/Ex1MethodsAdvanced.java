package methods;

public class Ex1MethodsAdvanced {

    //Ex.1.Metode-Avansat. Creeaza un program care afiseaza toate permutarile distincte din trei elemente.
    //Exemplu: Pentru a b c se va afisa: abc, bac, bca, acb, cab, cba.

    public static void main(String[] args) {
        String str = "abc";
        permutari("", str);
    }

    public static void permutari(String prefix, String s) {
        int n = s.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i =0; i < n; i++){
                permutari(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1, n));
            }
        }
    }

}
