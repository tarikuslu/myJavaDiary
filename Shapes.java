package examples;

public class Shapes {

    public static void main(String[] args) {
        drawFilledRectangle(15, 30);
        System.out.println("-----------------------------------");
        drawBlankedRectangle(15, 30);
        System.out.println("-----------------------------------");
        drawFilledTriangle(10, 15);
        System.out.println("-----------------------------------");
        drawEquialateralTriangle(9);
    }

    public static void drawFilledRectangle(int kisaKenar, int uzunKenar) {
        for (int i = 0; i < uzunKenar; i++) {
            for (int j = 0; j < kisaKenar; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawBlankedRectangle(int kisaKenar, int uzunKenar) {
        for (int i = 0; i < uzunKenar; i++) {
            for (int j = 0; j < kisaKenar; j++) {
                if (i == 0 || i == uzunKenar - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0) {
                        System.out.print("*");
                    } else if (j == kisaKenar - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    public static void drawFilledTriangle(int satirKenar, int sutunKenar) {
        int sayac = 1;

        for (int i = 0; i < satirKenar; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("*");

                } else {
                    System.out.print("**");

                }
            }

            System.out.println();
        }
    }

    public static void drawEquialateralTriangle(int satirKenar) {
        for (int i = 1; i <= satirKenar; i++){
            for (int j = i; j < satirKenar; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
