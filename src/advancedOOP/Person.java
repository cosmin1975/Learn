package advancedOOP;

public class Person {

    private String nume;
    private int varsta;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
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

    public void ordoneazaPersoane(Person person){
        System.out.print(person.getNume() + " is " +person.getVarsta() + " old and" );
        if(person.getVarsta() < 25 ){
            System.out.println(" is going to Mall.");
        }
        if(person.getVarsta() >= 25 && person.getVarsta()<30 ){
            System.out.println(" is partying tonight.");
        }
        if(person.getVarsta() >= 30 && person.getVarsta()<40){
            System.out.println(" is going to the theatre.");
        }
        if(person.getVarsta() >= 40 ){
            System.out.println(" is staying home tonight.");
        }
    }
}
