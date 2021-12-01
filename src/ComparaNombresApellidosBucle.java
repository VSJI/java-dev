import javax.swing.*;

public class ComparaNombresApellidosBucle {
    public static void main(String[] args) {

        System.out.println("INSTRUCCIONES\n\n1. Este programa permite comparar la longitud de los nombres de 3 amigos o familiares.\n");

        String[] nombresFamiliares = new String[3];
        String[] numOrdinal = {"primer", "segundo", "tercer"};
        String logNombres = "";

        for (int countNombres = 0; countNombres < nombresFamiliares.length; countNombres++) {

            String nombreCompleto = JOptionPane.showInputDialog(null, "Introduzca el " + numOrdinal[countNombres] + " nombre" +
                    " y apellidos de un familiar o amigo");

            int espaciosNombreApellidos = nombreCompleto.toCharArray().length - nombreCompleto.replaceAll(" ", "").length();
            int espaciosNombre = 0;

            String[] nombreApellidos = nombreCompleto.split(" ", 0);

            if (espaciosNombreApellidos == 1 || espaciosNombreApellidos == 2) {
                espaciosNombre = 0;
            } else if (espaciosNombreApellidos >= 3) {
                espaciosNombre = 1;
            }

            String nombreFamiliar = "";

            for (int posicionPalabra = 0; posicionPalabra <= espaciosNombre; posicionPalabra++) {
                String separador = espaciosNombre == 0 ? "" : posicionPalabra == espaciosNombre ? "" : " ";
                nombreFamiliar += nombreApellidos[posicionPalabra] + separador ;
            }

            logNombres += nombreFamiliar + (countNombres == nombresFamiliares.length - 1 ? "" : ";");
            nombresFamiliares[countNombres] = nombreFamiliar;

            System.out.println("nombreFamiliar = [" + nombreFamiliar + "]");
            System.out.println("Longitud = [" + nombreFamiliar.length() + "]");

        }

        String nombreMasLargo = "";
        for (int posicionNombreComprobar = 0; posicionNombreComprobar <= nombresFamiliares.length; posicionNombreComprobar++) {
            if (posicionNombreComprobar == 0) {
                continue;
            } else if (posicionNombreComprobar == nombresFamiliares.length) {
                break;
            } else {
                if (nombresFamiliares[posicionNombreComprobar - 1].length() >= nombresFamiliares[posicionNombreComprobar].length()) {
                    nombreMasLargo = nombresFamiliares[posicionNombreComprobar - 1];
                } else {
                    nombreMasLargo = nombresFamiliares[posicionNombreComprobar];
                }
            }
        }

        System.out.println("\nlogNombres = [" + logNombres + "]");

        System.out.println("\nEl nombre más largo de los nombres y apellidos de familiares introducidos, es:\n" +
                "\n==============\n" + nombreMasLargo + "\n==============");


    }
}
