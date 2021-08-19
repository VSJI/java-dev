public class HolaMundo {
    public static void main(String[] args){

        String saludo = "Juan vas bien con Java";
        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());
        
        int numero = 10;

        boolean valor = true;
        int numero2 = 6;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 2;
        }
        System.out.println("numero2 = " + numero2);
        
        var numero3 = "15";
        
        String nombre;
        nombre = "Juan";
        
        if (numero > 9){
            nombre = "John";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
    }
}
/*Un método tiene que ser público, statico, void(este metodo no devuelve valor, solo ejecuta) y main*/

/*Tipos de datos: PrimitivosEnteros y referencia*/

/*PrimitivosEnteros son booleanos, integer, float, etc*/

/*Referencia son instancia a array, clases, interfaces, */

/*soutp, soutv, psvm para crear clase desde cero*/