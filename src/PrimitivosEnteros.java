public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numByte = 127;
        System.out.println("\nnumByte = " + numByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES );
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE );
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE );
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE );

        short numShort = 32767;
        System.out.println("\nnumShort = " + numShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES );
        System.out.println("tipo short corresponde en bites a " + Short.SIZE );
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE );
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE );

        int numInt = 2147483647;
        System.out.println("\nnumInt = " + numInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES );
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE );
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE );
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE );

        long numLong = 9223372036854775807L;
        System.out.println("\nnumLong = " + numLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES );
        System.out.println("tipo long corresponde en bites a " + Long.SIZE );
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE );
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE );

        float numFloat = 9223372036854775807F;

        /*no soportado en versiones anteriores a java 10*/
        var numeroVar= 922337203685477580L;

    }
}
