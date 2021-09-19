import java.util.Scanner;


public class DetalleFactura {
    public static void main(String[] args) {

        // Iniciamos la entrada de datos por consola y la variable en la que iremos guardando la traza del cálculo de la factura
        Scanner datosFactura = new Scanner(System.in);
        String logFactura = "";

        System.out.println("Escriba un nombre o descripción para la factura:");

        // Obtenemos el nombre para la factura
        String nombreFactura = datosFactura.nextLine();
        logFactura += "nombreFactura=" + nombreFactura + ";";

        System.out.println("Introduzca el importe sin impuestos del primer producto de la factura:");

        // Validamos que el dato introducido es un decimal y que no es menor que 0
        double primerProducto = 0;

/*            while( (!datosFactura.hasNextDouble() ) ){
                System.out.println("Error: el dato introducido no se corresponde con un importe. \n Por favor, introduzca un importe válido:");
            }
            while ( datosFactura.nextDouble() < 0 ){
                System.out.println("Error: el importe introducido es negativo. \n Por favor, introduzca un importe válido:");
                datosFactura.next();
            }
            primerProducto = datosFactura.nextDouble();*/


        while ( (!datosFactura.hasNextDouble() ) || (datosFactura.nextDouble() < 0) ){
            System.out.println("Error: el dato introducido no se corresponde con un importe válido. \n Por favor, introduzca un importe válido:");
            datosFactura.next();
        }




        logFactura += "primerProducto=" + primerProducto + ";";

        System.out.println("Introduzca el importe sin impuestos del segundo producto de la factura:");

        // Obtenemos el precio del segundo producto
        double segundoProducto = datosFactura.nextDouble();
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

        double totalFactura = Math.round((totalFacturaSinRedondeo * 100)/100);
        logFactura += "totalFactura=" + totalFactura + ";";

        System.out.println("La factura con nombre o identificador \"" + nombreFactura + "\", es de un importe sin impuestos incluidos de " + sumaProductos +
                "€, con un impuesto del 19% sobre la suma de los productos por valor de " + impuestosFactura + "€, suman un total de la factura de " + totalFactura + "€ con impuestos incluidos");

        System.out.println("\n\nLOGFACTURA\n" + logFactura);

        datosFactura.close();

        }
    }

