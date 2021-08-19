import java.util.Scanner;

public class OperadoresLogicosLoginSegundaParte {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String usuario = scanner.next();

        System.out.println("Ingrese el password");

        String contrasena = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length; i++){

            esAutenticado = ((usernames[i].equals(usuario) && passwords[i].equals(contrasena)) ? true : esAutenticado);

            // DEPRECATED
/*            if ( (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) ){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? ("Bienvenido usuario " + usuario + "!"):
                "Username o contraseña incorrecto \nLo sentimos, se requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        // DEPRECATED
/*        if(esAutenticado){
            System.out.println("Bienvenido usuario " + usuario + "!");
        } else {
            System.out.println("Lo sentimos, se requiere autenticación");
            System.out.println("Username o contraseña incorrecto");
        }*/
        
    }
}
