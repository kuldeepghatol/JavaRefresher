import java.util.Scanner;

public class Static2DArray {

    public static void main(String[] args) {
        //simpleArrayInputAndPrint();
       // printWaveFormColumnWise();
        printWaveFormRowWise();
    }


    public static void printWaveFormRowWise() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int [][] mat = new int[n][n];

        for(int i =0; i<n; i++){
            for(int j=0;j<n;j++){
                mat[i][j] = s.nextInt();
            }
        }

        for(int i =0; i<n; i++){
            if(i%2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
    public static void printWaveFormColumnWise() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
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
