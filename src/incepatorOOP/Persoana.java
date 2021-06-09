package incepatorOOP;

public class Persoana {
    private String nume;
    private int varsta;
    private String ocupatie;
    public Persoana(){
        System.out.println("Constructor Persoana");
    }
    public Persoana(String nume, int varsta, String ocupatie){
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
        System.out.println("Persoana se numeste " + nume + ", are " + varsta + " ani si este " + ocupatie+".");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void printPersoana(){
        System.out.println("Persoana se numeste " + getNume() + ", are " + getVarsta() + " ani si este " + getOcupatie()+".");;
    }

}
