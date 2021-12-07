package clasesJava;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Juan";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Juan\") = " + nombre.equals("Juan"));
        System.out.println("nombre.equals(\"juan\") = " + nombre.equals("juan"));
        System.out.println("nombre.equalsIgnoreCase(\"Juan\") = " + nombre.equalsIgnoreCase("Juan"));
        System.out.println("nombre.compareTo(\"Juan\") = " + nombre.compareTo("Juan"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        
        //SEGUNDA PARTE MÉTODOS STRING
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("System.identityHashCode(trabalenguas) = " + System.identityHashCode(trabalenguas));
        System.out.println("trabalenguas = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.lastIndexOf("z"));
        System.out.println("trabalenguas.lastIndexOf(\"t\") = " + trabalenguas.lastIndexOf("t"));
        System.out.println("trabalenguas.lastIndexOf(\"lenguas\") = " + trabalenguas.lastIndexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("_ trabalenguas _");
        System.out.println("_ trabalenguas _".replace("_","").trim());
    }
}
