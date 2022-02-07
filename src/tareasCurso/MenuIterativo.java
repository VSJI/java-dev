package tareasCurso;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuIterativo {
    public static void main(String[] args) {

        int opcionIndice = 0;


        // los Map (o mapas) los veremos mas adelante en el curso en profundidad
        // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
        // también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            if ( opcionIndice == 1 ) {
                System.out.println("Opción seleccionada \"Actualizar\": " + opcionIndice);
            }
            else if ( opcionIndice == 2 ) {
                System.out.println("Opción seleccionada \"Eliminar\": " + opcionIndice);
            }
            else if ( opcionIndice == 3 ) {
                System.out.println("Opción seleccionada \"Agregar\": " + opcionIndice);
            }
            else if ( opcionIndice == 4 ) {
                System.out.println("Opción seleccionada \"Listar\": " + opcionIndice);
            }
            else if ( opcionIndice == 5 ) {
                System.out.println("Opción seleccionada \"Salir\": " + opcionIndice);
            } else {
                System.out.println("Opción seleccionada \"DESCONOCIDA\": " + opcionIndice);
            }


//            opciones.get("Actualizar");
        }




    }
}
