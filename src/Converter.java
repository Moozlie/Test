import java.util.Scanner;
public class Converter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите градусы по Цельсию: ");
            double celsius = scanner.nextDouble();

            System.out.println("Выберите тип конвертации:");
            System.out.println("1. Конвертировать в Фаренгейты");
            System.out.println("2. Конвертировать в Кельвины");

                int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println(celsius + " градусов по Цельсию равно " + convertToFahrenheit(celsius) + " градусов по Фаренгейту");
                break;
                case 2:
                System.out.println(celsius + " градусов по Цельсию равно " + convertToKelvin(celsius) + " градусов по Кельвину");
                break;
                default:
                    System.out.println("Некорректный выбор");
            }
            scanner.close();
        }
        public static double convertToFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }
            public static double convertToKelvin(double celsius) {
                return celsius + 273.15;
            }
        }