import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        int[] liczby = new int[5];
        System.out.println("Podaj " + liczby.length + " liczb:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i + 1) + " liczba: ");
            liczby[i] = getInt();
        }
        for (int x : liczby) {
            if (x < 0) {
                System.out.println(
                        "Liczba jest mniejsza od 0. Nie można obliczyć silnii "

                );
            } else {
                int silnia = 1;
                for (int i = 1; i <= x; i++) {
                    silnia *= i;
                }
                System.out.println("Silnia liczby " + x + " wynosi " + silnia);
            }
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}