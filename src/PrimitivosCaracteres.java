public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
//        var caracter2 = '\u0040';
        char decimal = 64;
        var decimal2 = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';
        char espacio2 = '\u0020';
        System.out.println("char concatenando espacio = " + espacio + Character.BYTES);
        System.out.println("Mostrando espacio = _" + espacio + "_");
        System.out.println("Mostrando espacio2 = _" + espacio2 + "_");

        char retroceso = '\b';
        System.out.println("borrando con backspace espacio:" + retroceso + retroceso);

        char tabulador = '\t';
        System.out.println("Añadiendo tabulador:" + tabulador + "texto");
        System.out.println("Añadiendo tabulador en cadena \t\t:" + tabulador + "texto");

        char nuevaLinea = '\n';
        System.out.println("Nueva linea:" + nuevaLinea + "texto");

        char retornoCarro = '\r';
        System.out.println("Retorno carro:" + retornoCarro + "texto");

        char retornoCarro2 = '\r';
        System.out.println("Line separator:" + System.getProperty("line.separator") + "texto");
        System.out.println("Line separator:" + System.lineSeparator() + "texto");

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char caracter.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("char caracter.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
