package advancedOOP;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ion" , 32);
        Person person2 = new Person("Vasile" , 25);
        Person person3 = new Person("Gigi" , 20);
        Person person4 = new Person("Misu" , 41);
        Person person5 = new Person("Ana" , 30);

        person1.ordoneazaPersoane(person1);
        person2.ordoneazaPersoane(person2);
        person3.ordoneazaPersoane(person3);
        person4.ordoneazaPersoane(person4);
        person5.ordoneazaPersoane(person5);

    }
}
