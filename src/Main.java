import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        int number = getNumberElements();
        System.out.println("Enter standard symbol");
        char symbol = getStandardChar();
        char[] arr = new char[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = symbol;
        }
        fillArray(arr, arr.length / 2, arr.length / 2);
    }

    public static int getNumberElements() {
        Scanner scanner = new Scanner(System.in);
        boolean isOdd = true;
        System.out.println("Enter number of elements in array (Number must be ODD)");
        int number = scanner.nextInt();
        while (isOdd) {
            isOdd = false;
            if (number % 2 == 0) {
                System.out.println("Pleas, enter ODD number");
                number = scanner.nextInt();
                isOdd = true;
            }
        }
        return number;
    }

    public static char getStandardChar() {
        Scanner scanner = new Scanner(System.in);
        boolean isOneSymbol = true;
        String input;
        char symbol = '.';
        while (isOneSymbol) {
            input = scanner.nextLine();
            symbol = input.charAt(0);
            isOneSymbol = false;
            if (input.length() > 1) {
                System.out.println("One symbol");
                isOneSymbol = true;
            }
        }
        return symbol;
    }

    public static void fillArray(char[] arr, int from, int to) {
        System.out.println("Enter symbol for Tree");
        char symbol = getStandardChar();
        System.out.println("Your Tree:");
        while (from >= 0 && to <= arr.length) {
            arr[from] = symbol;
            arr[to] = symbol;
            from--;
            to++;
            for (char s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
