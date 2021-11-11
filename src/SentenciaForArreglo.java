import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

//        String[] nombres = new String[6];
//        String nombres[] = new String[6];
        String[] nombres = {"Juan", "Rocio", "Rafa", "Rubén", "Luis", "Jose", "Dani", "Migue"};
        int count = nombres.length;

        for (int i = 0; i < count; i++){

            // Cuidado con usar nombres[i].equals("rocio") o nombres[i].contains("paco"), no funcionarían ya que en el array
            // existe con la "P" en mayuscula, pero no existe "paco" en minuscula
            // Siempre se puede convertir todo a minuscula así: nombres[i].toLowerCase().contains("LUIS".toLowerCase()))

            if (nombres[i].equalsIgnoreCase("jose") ||
            nombres[i].equalsIgnoreCase("rocio") ){
                continue;
                // "continue" permite saltar determinadas repeticiones del bucle
            }

            if (nombres[i].toLowerCase().contains("LUIS".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("MiGuE".toLowerCase() ) ){
                continue;
                // continue permite saltar determinadas repeticiones del bucle
            }
            System.out.println("nombres[" + i + "] = " + nombres[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Juan\" o \"Rocío\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for ( int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema :(");
        }



    }
}

