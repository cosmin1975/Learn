package advancedOOP;

public class Box {
    private int id;
    private char c;
    private double latime;
    private double lungime;
    private double inaltime;

    public Box(int id, double latime, double lungime, double inaltime) {
        this.id = id;
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public double calculeazaVolumul() {
        double volum = latime * lungime * inaltime;
        return volum;
    }
}
