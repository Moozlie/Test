public class Minmax {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int max = array[0];
        int min = array[0];
        double sum = 0;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double avg = sum / size;

        System.out.println("Массив случайных чисел:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n   Максимальное значение:" + max);
        System.out.println("   Минимальное значение:" + min);
        System.out.println("   Среднее значение:" + avg);
    }
}