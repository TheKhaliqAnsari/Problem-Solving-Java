import java.util.Scanner;

class myCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = { { 2, -1, 3, 2 }, { 3, 2, 6, 2 }, { 10, 9, 8, 2 }, { 4, -1, 2, 3 }, { 3, 2, 6, 3 } };
        int sum = 0;
        for (int i = 2; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}