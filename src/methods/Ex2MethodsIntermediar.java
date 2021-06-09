package methods;

public class Ex2MethodsIntermediar {

    //Ex.2.Metode-Intermediar. Creeaza un prigram care accepta un sir de caractere(Hint: Google) si afiseaza de cate
    // ori contine un subsir ales inainte:
    // Exemplu:
    // sir complet- "Astazi invat Java si zilnic fac aplicatii".
    // subsir - "zi"

    public static void main(String[] args) {
        String sir = "Astazi invat Java si zilnic fac aplicatii";
        String subsir = "zi";
        System.out.println(numaraSubsir(sir, subsir));
    }

    public static Integer numaraSubsir(String sir, String subsir) {
        int counter = 0, index = 0;
        while (true) {
            index = sir.indexOf(subsir, index); //cauta in sir exixtenta lui subsir si "noteaza" indexul
            if (index != -1){ // daca index diferit de -1, adica inca mai gaseste subsir in sir,
                counter++; // numara aparitiile
                index += subsir.length(); //si aduna la index lungimea lui subsir
            } else {
                break;
            }
        }
        return counter;
    }
}
