package Семинар_1;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input operator of expression: ");
        CharSequence operator = in.next();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        if (operator.equals("+")) System.out.println(a + b);
        if (operator.equals("-")) System.out.println(a - b);
        if (operator.equals("*")) System.out.println(a * b);
        if (operator.equals("/")) System.out.println(a / b);
        in.close();
    } 
}
