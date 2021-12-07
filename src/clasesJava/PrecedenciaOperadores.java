package clasesJava;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        Integer i = 14;
        Integer j = 8;
        Integer k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10d; // 14 + 8 + 0.6
        System.out.println("promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (15 + 8) + 66.6
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        String name = "Juan Velasco";
        System.out.println("Mi nombre es " +name );


    }
}
