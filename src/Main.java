public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.println("## break ##");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("## continue ##");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("## return ##");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }

            System.out.println(i);
        }




    }
}
