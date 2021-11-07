import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void func(List<String> list) {
        for (String x : list) {
            System.out.println(x);
        }
    }

    public static void func(Set<Integer> set) {
        for (Integer x : set) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int numAnimals = 5;

        for (int i = 0; i < numAnimals; i++) {
            System.out.printf("Podaj nazwę %d zwierzęcia: ", i + 1);
            list.add(scan.next());
        }
        System.out.println("#########");
        func(list);

        for (int i = numAnimals - 1; i >= numAnimals - 2; i--) {
            list.remove(i);
        }

        System.out.println("#########");
        func(list);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Podaj nazwę %d zwierzęcia: ", list.size() + 1);
            list.add(scan.next());
        }

        System.out.println("#########");
        func(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("#########");
        func(list);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Podaj %d liczbę: ", i + 1);
            set.add(scan.nextInt());
        }

        System.out.println("#########");
        func(set);
    }

}
