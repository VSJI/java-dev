public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        // //testeo
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2;
        resultado2 = curso.transform((String c) ->{return c + " con " + profesor;});

//         Para subir al repositorio CTRL + ALT + K

//        String resultado2 = curso.concat(profesor);

        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
        resultado.replace("a","A");
        //En este punto "resultado" no es modificado, es necesario utilizar una variable para que "resultado" sea modificado por el "replace"
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);
    }
}

