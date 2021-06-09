package advancedOOP;

public class Muzician extends Person{
    String instrument;
    String genMuzical;
    Boolean stare;


    public Muzician(String nume, int varsta) {
        super(nume, varsta);
    }

    public Muzician(String nume, int varsta, String instrument, String genMuzical, Boolean stare) {
        super(nume, varsta);
        this.instrument = instrument;
        this.genMuzical = genMuzical;
        this.stare = stare;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public void setStare(Boolean stare) {
        this.stare = stare;
    }
}
