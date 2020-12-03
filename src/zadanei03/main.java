package zadanei03;

import java.util.Scanner;

public class main {

    public static double funkcji_liniowej(double a, double b) {
        double x = -b / a;

        return x;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = scanner.nextInt();
        System.out.println("Podaj b:");
        int b = scanner.nextInt();

        double funkcja = funkcji_liniowej(a, b);{


        }if (funkcja == 0) {
            System.out.print("brak mniejsc zerowych");
        }
        else if (funkcja > 0 ) {
            System.out.print("Wynik to:" + funkcja);
        }

    }
    }
