public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        String Resultado = "";
        for(int i = 0; i < largo; i++){
            Resultado += arreglo[i];
//            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
            System.out.print(arreglo[i]);
        }
        System.out.println("\nResultado => " + Resultado);
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l ; j++){
            System.out.println(arreglo2[j]);
        }
        String archivo = "alguna.imagen.pdf";

        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l ; j++){
            System.out.println(archivoArr[j]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
    }
}
