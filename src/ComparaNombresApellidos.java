import javax.swing.*;

public class ComparaNombresApellidos {
    public static void main(String[] args) {

        System.out.println("INSTRUCCIONES\n\n1. Este programa permite comparar la longitud de los nombres de 3 amigos o familiares.\n");

        String[] nombresFamiliares = new String[3];
        String logNombres = "";

            /* ************************** */
            /* Primer nombre y apellidos */
            /* ************************* */

            String primerNombreCompleto = JOptionPane.showInputDialog(null, "Introduzca el primer nombre" +
                    " y apellidos de un familiar o amigo");

            int espaciosNombreApellidos = primerNombreCompleto.toCharArray().length - primerNombreCompleto.replaceAll(" ", "").length();
            int espaciosNombre = 0;

            if (espaciosNombreApellidos == 1 || espaciosNombreApellidos == 2) {
                espaciosNombre = 0;
            } else if (espaciosNombreApellidos >= 3) {
                espaciosNombre = 1;
            }

            String[] primerNombreApellidos = primerNombreCompleto.split(" ", 0);

            if ( espaciosNombre == 0 ) {
                nombresFamiliares[0] = primerNombreApellidos[0];
            } else {
                nombresFamiliares[0] = primerNombreApellidos[0] + " " + primerNombreApellidos[1];
            }

            String nombreFamiliar = nombresFamiliares[0];
            logNombres += nombreFamiliar + ";";


            System.out.println("nombreFamiliar = [" + nombreFamiliar + "]");
            System.out.println("Longitud = [" + nombreFamiliar.length() + "]\n");

            /* *************************** */
            /* Segundo nombre y apellidos  */
            /* *************************** */

            String segundoNombreCompleto = JOptionPane.showInputDialog(null, "Introduzca el segundo nombre" +
                    " y apellidos de un familiar o amigo");

            espaciosNombreApellidos = segundoNombreCompleto.toCharArray().length - segundoNombreCompleto.replaceAll(" ", "").length();
            espaciosNombre = 0;

            if (espaciosNombreApellidos == 1 || espaciosNombreApellidos == 2) {
                espaciosNombre = 0;
            } else if (espaciosNombreApellidos >= 3) {
                espaciosNombre = 1;
            }

            String[] segundoNombreApellidos = segundoNombreCompleto.split(" ", 0);

            if ( espaciosNombre == 0 ) {
                nombresFamiliares[1] = segundoNombreApellidos[0];
            } else {
                nombresFamiliares[1] = segundoNombreApellidos[0] + " " + segundoNombreApellidos[1];
            }

            nombreFamiliar = nombresFamiliares[1];

            logNombres += nombreFamiliar + ";";

            System.out.println("nombreFamiliar = [" + nombreFamiliar + "]");
            System.out.println("Longitud = [" + nombreFamiliar.length() + "]\n");


            /* *************************** */
            /*  Tercer nombre y apellidos  */
            /* *************************** */


            String tercerNombreCompleto = JOptionPane.showInputDialog(null, "Introduzca el segundo nombre" +
                    " y apellidos de un familiar o amigo");

            espaciosNombreApellidos = tercerNombreCompleto.toCharArray().length - tercerNombreCompleto.replaceAll(" ", "").length();
            espaciosNombre = 0;

            if (espaciosNombreApellidos == 1 || espaciosNombreApellidos == 2) {
                espaciosNombre = 0;
            } else if (espaciosNombreApellidos >= 3) {
                espaciosNombre = 1;
            }

            String[] tercerNombreApellidos = tercerNombreCompleto.split(" ", 0);

            if ( espaciosNombre == 0 ) {
                nombresFamiliares[2] = tercerNombreApellidos[0];
            } else {
                nombresFamiliares[2] = tercerNombreApellidos[0] + " " + tercerNombreApellidos[1];
            }

            nombreFamiliar = nombresFamiliares[2];

            logNombres += nombreFamiliar + ";";

            System.out.println("nombreFamiliar = [" + nombreFamiliar + "]");
            System.out.println("Longitud = [" + nombreFamiliar.length() + "]\n");

            String nombreMasLargo = "";

            if ( nombresFamiliares[0].length() >= nombresFamiliares[1].length() &&
                    nombresFamiliares[0].length() >= nombresFamiliares[2].length() ) {
                nombreMasLargo = primerNombreCompleto;
            } else if ( nombresFamiliares[1].length() >= nombresFamiliares[0].length() &&
                    nombresFamiliares[1].length() >= nombresFamiliares[2].length() ) {
                nombreMasLargo = segundoNombreCompleto;
            } else if ( nombresFamiliares[2].length() >= nombresFamiliares[0].length() &&
                    nombresFamiliares[2].length() >= nombresFamiliares[1].length() ) {
                nombreMasLargo = tercerNombreCompleto;
            }

        System.out.println("\"" + nombreMasLargo + " tiene el nombre más largo.\"");

        System.out.println("\nlogNombres = [" + logNombres + "]\n");

    }
}
