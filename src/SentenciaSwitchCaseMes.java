import java.util.Scanner;

public class SentenciaSwitchCaseMes {
    public static void main(String[] args) {

        Scanner parametroUsuario = new Scanner(System.in);
        System.out.println("Introduzca el número del mes entre 1 - 12");

        int mes = parametroUsuario.nextInt();
        String nombreMes = null;

        //Admite char, byte, short e int. Character, Byte, Short, Int. Desde JDK 7, admite Strings

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
