import java.util.Scanner;

public class Practice_3_MultiplicationTable {
    public static void main(String[] args) {
        //1*1=1
        //1*2=2
        //1*3=3 и тд
        System.out.println("Введите число, результаты умножения которого вы хотите:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=1; i<=10; i++) {
            int result = number*i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
