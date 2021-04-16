import java.util.Scanner;

public class Practice_2_Deposits {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада");
        Scanner scanner = new Scanner(System.in);
        float savings = scanner.nextFloat();
        System.out.println("Введите кол-во месяцев ");
        int period = scanner.nextInt();

        for (int i=1; i<=period; i++){
            savings += savings * 0.07;
        }
        System.out.println("Конечная сумма вклада = " +savings);

        //savings = x + x*0,07 = x1 (после первого месяца)
        //savings = x1 + x1*0,07 =x2(после второго месяца

    }
}
