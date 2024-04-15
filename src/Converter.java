import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите градусы Цельсия: ");
            double celsius = scanner.nextDouble();

            System.out.println("Выберите тип конвертации:\n1. Цельсии в Фаренгейты\n2. Цельсии в Кельвины");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double fahrenheit = convertCelsiusToFahrenheit(celsius);
                    System.out.println(celsius + " градусов Цельсия равны " + fahrenheit + " градусам по Фаренгейту.");
                    break;
                case 2:
                    double kelvin = convertCelsiusToKelvin(celsius);
                    System.out.println(celsius + " градусов Цельсия равны " + kelvin + " Кельвинам.");
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}