public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

//        Integer num = 7;
        //Number num = 7; // en una variable que se crea, la parte derecha al "=" es llamado "la literal" y el "7" es un primitivo

        Number num = Integer.valueOf(7);

        //Autoboxie -> toma la literal, el primitivo y valor entero (7), compilador java lo convierte a objeto de la clase Integer

        Boolean b1 = texto instanceof String; // boolean como referencia clase
        boolean b2 = texto instanceof String; // boolean como primitivo

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

//        b1 = b2 instanceof Boolean; Un primitivo boolean no es instancia o referencia del objeto Boolean
        System.out.println("b1 es del tipo Boolean = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);

//        Number decimal = 45.54;
        b1 = decimal instanceof Float;
        System.out.println("Num es del tipo Float = " + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);
    }
}
