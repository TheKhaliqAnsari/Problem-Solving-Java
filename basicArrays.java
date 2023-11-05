import java.lang.String;
import java.util.Scanner;

public class basicArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int numbersArray[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int arrayElement = sc.nextInt();
            numbersArray[i] = arrayElement;
        }

        System.out.println("Arrays data: ->");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbersArray[i]);
            System.out.print(" ");
        }
    }
}