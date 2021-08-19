public class OperadoresIncrementales{
    public static void main(String[] args) {

        // Pre incremento
        System.out.println("\nPre incremento");
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        // Post incremento
        System.out.println("\nPost incremento");
        i = 2;
        System.out.println("\ninicial de i = " + i);
        j = i++;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        System.out.println("\nPre decremento");
        i = 3;
        j = --i; // i = i - 1 = 2
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        // Post decremento

        i = 4;
        j = i--;
        System.out.println("\nPost decremento");
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        System.out.println("\nTesteo");
        System.out.println("\n(++j) = " + (++j));
        System.out.println("(j++) = " + (j++ ));
        System.out.println("j = " + j);
    }
}
