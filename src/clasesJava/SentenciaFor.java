package clasesJava;

public class SentenciaFor {
    public static void main(String[] args) {

        //Esta forma de usar el for sacando del mismo las condiciones es igual que usar:
        // for (int = 1; i > 5; i++)

        int i = 1;

        for(;;){
            if (i > 5) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("\n");

        for(int x = 0;x <= 5; x++){
            System.out.println("x = " + x);
        }

        System.out.println("\n");

        for(int z = 5;z >= 0; z--){
            System.out.println("z = " + z);
        }

        System.out.println("\n");

        for(int j = 0, k = 6;j <= k; j++){
            System.out.println("j = " + j + "; k = " + k);
        }

        System.out.println("\n");

        for(int j = 0;j <= 5; j++){
            if ( !((j%2) == 0) ){
                continue;
            }
            System.out.println("PAR j = " + j);
        }
    }
}
