import java.util.Scanner;

public class Static2DArray {

    public static void main(String[] args) {
        simpleArrayInputAndPrint();
    }


    public static void simpleArrayInputAndPrint() {
        System.out.print("Hello World");

        Scanner s = new Scanner(System.in);

        int rows = s.nextInt();
        int cols = s.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
