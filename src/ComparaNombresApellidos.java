import javax.swing.*;

public class ComparaNombresApellidos {
    public static void main(String[] args) {


        System.out.println("INSTRUCCIONES\n\n1. Este programa permite comparar la longitud de los nombres de 3 amigos o familiares.");

        String primerNombreApellidos = JOptionPane.showInputDialog(null, "Introduzca el primer nombre" +
                " y apellidos de un familiar o amigo");

        int espaciosPrimerNA = primerNombreApellidos.toCharArray().length - primerNombreApellidos.replaceAll(" ", "").length();
        System.out.println("espaciosPrimerNA = " + espaciosPrimerNA);
        //        int countPrimerNA = primerNombreApellidos.toCharArray().

//        String segundoNombreApellidos = JOptionPane.showInputDialog(null, "Introduzca el segundo nombre" +
//                " y apellidos de un familiar o amigo");
//
//        String tercerNombreApellidos = JOptionPane.showInputDialog(null, "Introduzca el tercer nombre" +
//                " y apellidos de un familiar o amigo");
//
//        int countPrimerNA = primerNombreApellidos.cha
//        int countSegundoNA;
//        int countTercerNA;






        


    }
}
