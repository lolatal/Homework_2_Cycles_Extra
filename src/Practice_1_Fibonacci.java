public class Practice_1_Fibonacci {
    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        //начинаем считать с третьего элемента
        for (int i=3; i<=11; i++) {
            int aNext = a1 + a2;
            a1=a2;
            a2=aNext;
            System.out.print(aNext + " ");
        }
        // 0, 1, 1, 2, 3, 5, 8, 13,21...
        //число равно сумме двух предыдущих
    }
}
