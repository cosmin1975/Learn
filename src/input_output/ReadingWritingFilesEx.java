package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingWritingFilesEx {
    //Creeaza un program care citeste numerele din 3 fisiere. Dupa citire, aceste numere vor fi sortate in ordine
    // crescatoare si vorm fi scrise intr-un fisier nou denumit "rezultat.txt". Pe prima linie se va scrie cel  mai
    // mare numar dintre cele citite, urmat de numarul total de elemente citite din cele 3 fisiere.

    public static void main(String[] args) {
        //creare fisier: "rezultat.txt"
        String filename = "rezultat.txt";
        File fisier1 = new File("fisier1.txt");
        File fisier2 = new File("fisier2.txt");
        File fisier3 = new File("fisier3.txt");
        File fileObj = new File(filename);
        ArrayList<String> data = new ArrayList<>();
        try {
            if (fileObj.createNewFile()) {
                System.out.println("Fisierul a fost creat: " + fileObj.getName());
            } else {
                System.out.println("Fisierul exista deja.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        //citire/scriere din/in fisier
        try {
            Scanner fileReader1 = new Scanner(fisier1);
            Scanner fileReader2 = new Scanner(fisier1);
            Scanner fileReader3 = new Scanner(fisier1);
            while (fileReader1.hasNextLine() && fileReader2.hasNextLine() && fileReader3.hasNextLine()) {
                FileWriter localWriter = new FileWriter("rezultat.txt");
                data.add(fileReader1.nextLine());
                data.add(fileReader2.nextLine());
                data.add(fileReader3.nextLine());
                data.stream().sorted();
                localWriter.write(String.valueOf(data));
                localWriter.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();


        }
    }
}
