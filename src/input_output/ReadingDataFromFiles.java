package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromFiles {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Ge\\Desktop\\";
        String filename = "file.txt";
        File fisierObj = new File(filename);

        //Crearea unui fisier

        try {
            if (fisierObj.createNewFile()) {
                System.out.println("Fisierul a fost creat: " + fisierObj.getName());
            } else {
                System.out.println("Fisierul exista deja.");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(fisierObj.getAbsolutePath());

        File fisierLocal = new File(filename);

        //Stergerea unui fisier
/*        if (fisierLocal.delete()){
            System.out.println("File deleted successfully");
        }*/

        //Citirea dintr-un fisier
        try {
            File fileObj = new File("fisierul_meu.txt");
            Scanner fileReader = new Scanner(fileObj);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
//            fileObj.getAbsolutePath();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
