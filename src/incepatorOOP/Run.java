package incepatorOOP;

public class Run {
    public static void main(String[] args) {
        long start = System.nanoTime();

        Integer x = new Integer(2 + 3);

        //start = 2 + 3;

        System.out.println(System.nanoTime()-start);

    }
/*

    private long run() {
        long start = System.nanoTime();

        Integer x = new Integer(2 + 3);

        start = 2 + 3;
        return System.nanoTime() - start;

    }
*/

}
