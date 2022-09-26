import java.util.Scanner;
public class Example27 {

    public static final int NUM_TERM = 40;

    public static void main(String[] argv) {

        int n1, n2, n3;
        System.out.println("1, 1");

        n1 = 1;
        n2 = 1;

        for (int i = 3; i <= NUM_TERM; i++) {
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
