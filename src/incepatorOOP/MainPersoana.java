package incepatorOOP;

public class MainPersoana {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana();
        persoana1.setNume("Ion");
        persoana1.setVarsta(32);
        persoana1.setOcupatie("programator");
        persoana1.printPersoana();
        Persoana persoana2 = new Persoana("Marin", 23, "Inginer");

    }
}
