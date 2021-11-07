public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int nrIndeksu = 57086;
        int dzielnik = 86;
        int i = 1000;

        while (i > 0) {
            if (i % dzielnik == 0) {
                System.out.printf("Liczba %d podzielna przez %s\n", i, dzielnik);
            }

            i--;
        }

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int[] intArr = {12, 4322, 65, 23, 39};
        i = 0;

        while (i < intArr.length) {
            System.out.printf("intArr[%d] = %s\n", i, intArr[i]);

            i++;
        }

        double[] doubleArr = {12., 4322., 65., 23., 39.};
        i = 0;

        while (i < doubleArr.length) {
            System.out.printf("doubleArr[%d] = %s\n", i, doubleArr[i]);

            i++;
        }

        String[] stringArr = {"aaa", "bbb", "ccc", "ddd", "eee"};
        i = 0;

        while (i < doubleArr.length) {
            System.out.printf("stringArr[%d] = %s\n", i, stringArr[i]);

            i++;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        int x = 10;
        boolean flag = true;

        while(flag) {
            System.out.printf("x = %d\n", x);

            if (--x < 5) {
                flag = false;
            }
        }
    }
}
