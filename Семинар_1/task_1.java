package Семинар_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = n.nextInt();
        double triangle = num*(num+1)*(0.5);
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Your triangle number: %.0f \n", triangle);
        System.out.printf("Your factorial number: %d \n", factorial);
        n.close();
    }
}
