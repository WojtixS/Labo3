import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        int[] liczby = new int[8];
        System.out.println("Podaj " + liczby.length + " liczb:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i + 1) + " liczba: ");
            liczby[i] = getInt();
        }
        for (int i = 1; i < liczby.length; i++) {
            int aktualna = liczby[i];
            int j = i--;
            while (j >= 0 && liczby[j] > aktualna) {
                liczby[j + 1] = liczby[j];
                j--;
            }
            liczby[j + 1] = aktualna;
        }
        System.out.println("Liczby posortowane:");
        for (int x : liczby) {
            System.out.print(x + ", ");
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}