package Семинар_1;

public class task_2 {
    public static void main(String[] args) {
        String numbers = "1 2 3 5 7 ";
        for (int i = 7; i <=  1000; i++) {
            if (i % 2 !=0 && i % 3 !=0 && i % 5 !=0 && i % 7 != 0)
                numbers += i + "  ";    
        }
        System.out.println(numbers);
    }
    
}
