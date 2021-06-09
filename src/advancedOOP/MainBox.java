package advancedOOP;

public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box(1,10,10,11);
        Box box2 = new Box(2,11,11,12);
        Box box3 = new Box(3,12,12,13);
        Box box4 = new Box(4,13,13,13);
        double volum1 = box1.calculeazaVolumul();
        double volum2 = box2.calculeazaVolumul();
        double volum3 = box3.calculeazaVolumul();
        double volum4 = box4.calculeazaVolumul();
        System.out.println(volum1);
        System.out.println(volum2);
        System.out.println(volum3);
        System.out.println(volum4);


    }
}
