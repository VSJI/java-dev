public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        boolean datoLogico2 = Boolean.FALSE.booleanValue();
        boolean datoLogico3 = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 9874.56e-3; // 9.87456 Se mueve 3 posiciones a la izquierda la coma
        System.out.println("d = " + d);
        float f = 1.2345e2f; // 123.45 Se mueve 2 posiciones a la derecha la coma
        System.out.println("f = " + f);
        
        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
        
    }
}
