package clasesJava;

public class PrimitivosFloat {

//    static float varFlotante;
//    static float varFlotante = 45.45f;

    public static void main(String[] args) {
        float realFloat = 0.0000000015F;//1.5e-10F;
        System.out.println("\nrealFloat = " + realFloat);
        System.out.println("float corresponde en bytes = " + Float.BYTES);
        System.out.println("float corresponde en bits = " + Float.SIZE);
        System.out.println("float corresponde en bits = " + Float.MIN_VALUE);
        System.out.println("float corresponde en bits = " + Float.MAX_VALUE);

        double realDouble = 3.5f;
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("double corresponde en bytes = " + Double.BYTES);
        System.out.println("double corresponde en bits = " + Double.SIZE);
        System.out.println("double corresponde en bits = " + Double.MIN_VALUE);
        System.out.println("double corresponde en bits = " + Double.MAX_VALUE);

        float varFlotante = 3.1415f;
//        System.out.println("varFlotante = " + varFlotante);
        System.out.println("varFlotante = " + varFlotante);
    }
}
