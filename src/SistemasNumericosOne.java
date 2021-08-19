public class SistemasNumericosOne {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b111110100; //Se indica una variable binaria a interpretar con '0b' delante
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
        int numeroOctal = 0764; // Se indica una variable octal a interpretar con '0' delante
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; // Se indica variable hexadecimal a interpretar con '0x'
        System.out.println("numeroHex = " + numeroHex);
    }
}
