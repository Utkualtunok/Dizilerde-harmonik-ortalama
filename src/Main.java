public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        //Döngü ile tüm sayıları harmonik formülü için toplama atıyoruz
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        // harmonik formülü
        double harmonic = numbers.length / sum;
        System.out.println("Harmonik Ortalama: " + harmonic);
    }
}
