public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43";
        String realStr2 = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        double realDouble2 = Double.parseDouble(realStr2);
        System.out.println("realDouble = " + realDouble);
        System.out.println("realDouble2 = " + realDouble2);
        
        String logicStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt + " tipo: " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr + " tipo: " + otroNumeroStr.getClass().getName());

        Double otroRealDouble = 112345d;
        System.out.println("otroRealDouble = " + otroRealDouble);
        System.out.println("otroRealDouble = " + otroRealDouble);

        float otroNumeroFloat = 100f;
        System.out.println("otroNumeroFloat = " + otroNumeroFloat + " || " + ((Object)otroNumeroFloat).getClass().getName());
        //        System.out.println("otroNumeroFloat = " + otroNumeroFloat + " || " + Integer.);
        System.out.println("otroNumeroFloat = " + otroNumeroFloat + " || " + ((Object)Float.toString(otroNumeroFloat)).getClass().getName());
        System.out.println("String1 otroNumeroFloat = " + Float.toString(otroNumeroFloat) + " || " + Float.toString(otroNumeroFloat).getClass().getName());
        System.out.println("String2 otroNumeroFloat = " + String.valueOf(otroNumeroFloat) + " || " + String.valueOf(otroNumeroFloat).getClass().getName());

        // Para saber tipo de variable entero:
        //((Object)nombreVariable).getClass().getName()

        // Para saber tipo de variable string:
        // nombreVariable.getClass().getName()

        int i = 32768;
        short s = (short)i;
        long l = i;
        System.out.println("short = " + s);
        System.out.println("long = " + l);
        System.out.println("MAX SHORT = " + Short.MAX_VALUE);
        
        char b = (char) i;
        System.out.println("b = " + b);
    }
}

