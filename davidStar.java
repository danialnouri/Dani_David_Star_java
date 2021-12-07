import java.util.Scanner;

public class davidStar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        // first n row
        for (int i = 1; i < n + 1; i++) {
            for (int j = n + (2 * n) + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 0; x < i; x++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // next rows
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int x = n + (2 * n) + 2; x > i; x--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // second next rows
        for (int i = 1; i < n + 2; i++) {
            for (int j = n + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x < i + (2 * n) + 1; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // last rows
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i + (2 * n); j++) {
                System.out.print(" ");
            }
            for (int x = n + 1; x > i; x--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}