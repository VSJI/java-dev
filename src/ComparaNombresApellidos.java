import javax.swing.*;

public class ComparaNombresApellidos {
    public static void main(String[] args) {

        System.out.println("INSTRUCCIONES\n\n1. Este programa permite comparar la longitud de los nombres de 3 amigos o familiares.");

        String primerNombreApellidos = JOptionPane.showInputDialog(null, "Introduzca el primer nombre" +
                " y apellidos de un familiar o amigo");

        System.out.println("primerNombreApellidos. = " + primerNombreApellidos);

        String[] nuevoNombre = primerNombreApellidos.split(" ");

        int espaciosPrimerNA = primerNombreApellidos.toCharArray().length - primerNombreApellidos.replaceAll(" ", "").length();
        System.out.println("espaciosPrimerNA = " + espaciosPrimerNA);

        int primerEspacioBlanco = primerNombreApellidos.indexOf(" ");
        System.out.println("primerEspacioBlanco = " + primerEspacioBlanco);

//        System.out.println("String.); = " + String);






        


    }
}
