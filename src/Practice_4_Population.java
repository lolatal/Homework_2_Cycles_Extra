public class Practice_4_Population {
    public static void main(String[] args) {
        //10 000 000 = p1
        //1: + 140 000; -80 000;  p1 = 10 060 000;
        // p2 = p1 + p1/1000 * 6 = 10 120 360; (проверку прошло)
       int population = 10000000;
       int birthrate = 14;
       int mortality = 8;
       for (int i = 1; i<=10; i++) {
           if (birthrate>7) {
               birthrate-=1;
           }
           if (mortality>6) {
               mortality-=1;
           }
           population +=  population*(birthrate-mortality)/1000;
       }
        System.out.println(population);
    }
}
