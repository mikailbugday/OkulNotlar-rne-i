package giris;

public class CarpimTablosu {
    public static void main(String[] args) {
        // 1. FOR Döngüsü
        for (int a = 1; a <= 11; a++) {
            System.out.print("");
        }
        // 2. FOR Döngüsü
        for (int b = 1; b <= 10; b++) {
            System.out.print(b + " ");
        }
        System.out.println();
        // 3. FOR Döngüsü
        for (int c = 1; c <= 54; c++) {
            System.out.print("_");
        }
        System.out.println();
        // 4. FOR Döngüsü
        for (int d = 1; d <= 10; d++) {
            if (d < 10) {
                System.out.println(d + " 'ler | ");
            } else System.out.print(d + " 'lar | ");
            // 5. FOR Döngüsü
            for (int e = 1; e <= 10; e++) {
                if ((d * e) < 10) {
                    System.out.print((d * e) + " ");
                } else System.out.print((d * e) + " ");
            }
            System.out.println();
        }
    }
}
