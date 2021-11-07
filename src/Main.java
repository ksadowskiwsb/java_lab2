import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void func11(int[] arr) {
        int x = 40;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;

            x--;
        }
    }

    public static void func12(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d: %s\n", i, arr[i]);
        }
    }

    public static void func21(String[] arr, Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Podaj element %d: ", i);
            arr[i] = scan.next();
        }
    }

    public static void func22(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("Element %d: %s\n", i, arr[i]);
        }
    }

    public static void func3(String name) {
        System.out.printf("Name: %s\n", name);
    }

    public static void func3(String name, String surname) {
        System.out.printf("Name: %s Surname: %s\n", name, surname);
    }

    public static void func3(String name, String surname, int age) {
        System.out.printf("Name: %s Surname: %s Age: %d\n", name, surname, age);
    }

    public static int func4(int a, int b) { return a + b; }

    public static int func4(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int[] arr1 = new int[20];

        func11(arr1);
        func12(arr1);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        Scanner scan = new Scanner(System.in);
        String[] arr2 = new String[6];

        func21(arr2, scan);
        func22(arr2);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        func3("Krzysztof");
        func3("Krzysztof", "Sadowski");
        func3("Krzysztof", "Sadowski", 32);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int zmiennaA = func4(7, 4);
        int zmiennaB = func4(3, 2, 9);

        System.out.printf("zmiennaA + zmiennaB = %d\n", zmiennaA + zmiennaB);
    }

}
