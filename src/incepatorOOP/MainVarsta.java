package incepatorOOP;

public class MainVarsta {
    public static void main(String[] args) {
        Varsta v1, v2;
        v1 = new Varsta(5);
        v2 = v1;
        v2.setAni(10);
        v1.printVarsta();
    }
}
