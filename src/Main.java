import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        String[] arr = new String[3];
        int from = 1;
        int to = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ".";
        }
        while (from >= 0 && to <= 2) {
            if (from == to) {
                arr[from] = "*";
                from--;
                to++;
                for (String s : arr) {
                    System.out.print(s + " ");
                }
                System.out.println();
            } else {
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
}
