package clasesJava;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 1; i <= 7; i++) {

            System.out.println();
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("\nDía = " + i + ": Descanso fin de semana!");
                    continue bucle1;
                }
                System.out.println("Día = " + i + ": trabajando a las " + j + " hrs");
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println("\n*********************************************************\n");
        bucle2_1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            bucle2_2:
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2_1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println("\n----------------------------------------------------------\n");

        bucle3_1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;

            bucle3_2:
            while (j < 5) {
                if (i == 2) {
                    continue bucle3_1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }

        System.out.println("\n==========================================================\n");

        bucle4_1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;

            bucle4_2:
            while (j < 5) {
                if (i == 2) {
                    continue bucle4_1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }
    }
}

