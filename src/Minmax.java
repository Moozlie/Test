public class Minmax {
    public static void main(String[] args) {

        final int SIZE = 100 = 100;
        double[] array = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i <SIZE; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / SIZE;
        }

        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение  = " + min);
        System.out.println("Среднее значение = " + avg);
    }
}