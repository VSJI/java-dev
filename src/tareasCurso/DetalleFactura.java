package tareasCurso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Fuente1 relevante: http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html
// Fuente2 relevante: https://www.it-swarm-es.com/es/java/cual-es-la-diferencia-entre-los-metodos-next-y-nextline-de-la-clase-scanner/1044541919/

public class DetalleFactura {
    public static void main(String[] args) {

        // Iniciamos la entrada de datos por consola y la variable en la que iremos guardando la traza del cálculo de la factura
        Scanner scanner = new Scanner(System.in);
        String logFactura = "";

        System.out.println("Escriba un nombre o descripción para la factura:");

        // Obtenemos el nombre para la factura
        String nombreFactura = scanner.nextLine();
        logFactura += "nombreFactura=" + nombreFactura + ";";

        System.out.println("Introduzca el importe sin impuestos del primer producto de la factura:");

        // Inicializamos el precio del primer producto y validamos que el dato introducido es un decimal y que no es menor que 0
        double primerProducto = 0;

        boolean reTry = true;
        while (reTry) {
            if (scanner.hasNextDouble()) {
                primerProducto = scanner.nextDouble();
                if (primerProducto < 0) {
                    System.out.println("Error: el dato introducido no se corresponde con un importe válido. \n Por favor, introduzca un importe válido:");
                    scanner.nextLine();
                } else {
                    reTry = false;
                }
            } else {
                System.out.println("Error: el dato introducido no se corresponde con un importe válido. \n Por favor, introduzca un importe válido:");
                scanner.nextLine();
            }
        }
        scanner.reset();

        logFactura += "primerProducto=" + primerProducto + ";";

        System.out.println("Introduzca el importe sin impuestos del segundo producto de la factura:");

        // Inicializamos el precio del segundo producto y validamos que el dato introducido es un decimal y que no es menor que 0
        double segundoProducto = 0;
        Scanner scanner2 = new Scanner(System.in);
        boolean reintentar = true;
        while (reintentar) {
            if (scanner2.hasNextDouble()) {
                segundoProducto = scanner2.nextDouble();
                if (segundoProducto < 0) {
                    System.out.println("Error: el dato introducido no se corresponde con un importe válido. \n Por favor, introduzca un importe válido:");
                    scanner2.nextLine();
                } else {
                    reintentar = false;
                }
            } else {
                System.out.println("Error: el dato introducido no se corresponde con un importe válido. \n Por favor, introduzca un importe válido:");
                scanner2.nextLine();
            }
        }

        scanner2.close();
        logFactura += "segundoProducto=" + segundoProducto + ";";

        // Sumamos los importes de los productos
        double sumaProductos = (primerProducto + segundoProducto);
        logFactura += "sumaProductos=" + sumaProductos + ";";

        // Calculamos el 19% de impuestos sobre la suma de los productos anterior
        double impuestosFactura = sumaProductos * 0.19;
        logFactura += "impuestosFactura=" + impuestosFactura + ";";

        // Sumamos la suma de los productos con los impuestos
        double totalFacturaSinRedondeo = sumaProductos + impuestosFactura;
        logFactura += "totalFacturaSinRedondeo=" + totalFacturaSinRedondeo + ";";

        double totalFactura = Math.round((totalFacturaSinRedondeo * 100) / 100);
        logFactura += "totalFactura=" + totalFactura + ";";

        System.out.println("La factura con nombre o identificador \"" + nombreFactura + "\", es de un importe sin impuestos incluidos de " + sumaProductos +
                "€, con un impuesto del 19% sobre la suma de los productos por valor de " + impuestosFactura + "€, suman un total de la factura de " + totalFactura + "€ con impuestos incluidos");

/*        try {
            FileWriter myWriter = new FileWriter(new File ("C:\\Users\\jivelasco\\Desktop\\juanmijose.txt"));
            myWriter.write(logFactura);
            myWriter.close();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }*/

        scanner.close();

    }
}

