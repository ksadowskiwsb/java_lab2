import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int x = scan.nextInt();

        switch (x % 2) {
            case 0:
                System.out.printf("Liczba %d jest parzysta.\n", x);
                break;
            default:
                System.out.printf("Liczba %d jest nieparzysta.\n", x);
                break;

        }

        System.out.print("Podaj liczbę: ");
        x = scan.nextInt();

        switch (x % 7) {
            case 0:
                System.out.printf("Liczba %d jest podzielna przez 7.\n", x);
                break;
            default:
                System.out.printf("Liczba %d nie jest podzielna przez 7.\n", x);
                break;
        }


        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String str = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";

        int[] result = new int[2];

        for (char chr : str.toCharArray()) {
            switch (chr) {
                case 'o':
                case 'p':
                case 'x':
                case 'z':
                case 'q':
                    result[0]++;
                    break;
                default:
                    result[1]++;
                    break;
            }
        }

        System.out.printf("Ilość liter 'o', 'p', 'x', 'z', 'q': %d\n", result[0]);
        System.out.printf("Ilość pozostałych liter: %d\n", result[1]);
    }
}
