package structuri_si_colectii;

import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        //Crearea unui obiect din lista (poate fi LinkedList sau ArrayList)
        LinkedList<String> listaA = new LinkedList<String>();

        //Adaugarea elementelor in lista
        listaA.add("A");
        listaA.add("B");
        listaA.addLast("C");
        listaA.addFirst("D");
        listaA.add(2, "E");
        listaA.add("F");
        listaA.add("G");
        System.out.println("Lista inlantuita: " + listaA);

        //Stergerea elementelor din lista
        /*listaA.remove("B");
        listaA.remove(); //elimina primul element
        listaA.remove(3);
        listaA.removeFirst();
        listaA.removeLast();*/
        System.out.println("Lista inlantuita dupa elementele eliminate:" + listaA);

        //Cautarea elementelor din lista
        if (listaA.contains("E")) {
            System.out.println("Lista contine elementul 'E' ");
        } else {
            System.out.println("Lista nu contine elementul 'E' ");
        }

        //Numarul elementelor din lista
        System.out.println("Lungime listei este de: " + listaA.size() + " elemnte.");

        //Functiile get si set ale listei inlantuite:
        String element = listaA.get(2);
        System.out.println("Elemntul ales din lista este: " + element);

        listaA.set(2, "Y");
        System.out.println("Lista inlantuita dupa modificare: " + listaA);

//        Ex.1: Creeaza o lista care contine elemnetele: 1,4,9,16,25,36,49,64,81,100. Scrie in Java un program
//        care ia aceasta lista si face o lista noua care contine doar elementele pare ale acestei liste.

        LinkedList<Integer> listaNumere = new LinkedList<Integer>();
        listaNumere.add(1);
        listaNumere.add(4);
        listaNumere.add(9);
        listaNumere.add(16);
        listaNumere.add(25);
        listaNumere.add(36);
        listaNumere.add(49);
        listaNumere.add(64);
        listaNumere.add(81);
        listaNumere.add(100);
        System.out.println("Lista initiala: " + listaNumere);
        LinkedList<Integer> listaNumerePare = new LinkedList<>();
        for (int i = 0; i < listaNumere.size(); i++) {
            if (listaNumere.get(i) % 2 == 0) {
                listaNumerePare.add(listaNumere.get(i));
            }
        }
        System.out.println("Lista de numere pare este:" + listaNumerePare);

// Ex2. Creeaza o lista cu numele a 10 prieteni (numele nu trebuie sa fie distincte). Respectand ordinea, rezolva
// urmatoarele cerinte:
//        - Sorteaza lista dupa nume;
//        - Utilizand o lista auxiliara, determina numarul de aparitii al fiecarui nume
//        - Determina numele care apar de cele mai multe ori in lista initiala
//        - Determina numele care apar de cele mai putine ori in lista initiala
//        - Revenind la lista initiala de nume, inverseaza ordinea elementelor
        LinkedList<String> listaNume = new LinkedList<>();
        listaNume.add("Marian");
        listaNume.add("Valentina");
        listaNume.add("Alex");
        listaNume.add("Oana");
        listaNume.add("Bogdan");
        listaNume.add("Valentina");
        listaNume.add("Andreea");
        listaNume.add("Marian");
        listaNume.add("Valentina");
        System.out.println(listaNume);
        LinkedList<String> listaNume2 = new LinkedList<>();
        listaNume2 = listaNume;
        System.out.println(listaNume2);
        Collections.sort(listaNume);
        //System.out.println(listaNume);
        Collections.reverse(listaNume2);
        System.out.println(listaNume2);



    }
}
