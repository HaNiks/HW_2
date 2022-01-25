import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        int number = getNumberElements();
        String[] arr = new String[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ".";
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

    public static void fillArray(String[] arr, int from, int to) {
        while (from >= 0 && to <= arr.length) {
            arr[from] = "*";
            arr[to] = "*";
            from--;
            to++;
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
