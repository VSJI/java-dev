public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

//        for(int i = 0; i < 500; i = i+1) Es lo mismo poner para el incremento "i = i + 1"
        for(int i = 0; i < 10000; i++){
//            c = c.concat(a).concat(b).concat("\n");   // 500 => 4-7ms     1000 => 7-16ms  10000 => 190-235ms  100000 => 188-234ms =>>>> SE GENERAN MÁS DE 3 OBJETOS
//            c += a + b + "\n";                        // 500 => 39-44ms   1000 => 58ms    10000 => 144-165ms  100000 => 116-142ms =>>>> SE GENERAN 3 OBJETOS
            sb.append(a).append(b).append("\n");        // 500 => 2ms,      1000 => 2ms     10000 => 5-6ms      100000 => 4-5ms =>>>>>>>> ES EL MÁS RÁPIDO CON DIFERENCIA USAR STRING BUILDER
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
