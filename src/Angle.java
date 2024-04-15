import java.util.Scanner;
public class Angle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите часы (от 1 до 12):");
            int hours = scanner.nextInt();

            System.out.println("Введите минуты (от 0 до 59):");
            int minutes = scanner.nextInt();

            double angle = calculateClockAngle(hours, minutes);
            System.out.println("Угол между часовой и минутной стрелками: " + angle + " градусов.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static double calculateClockAngle(int hours, int minutes) {
        if (hours < 1 || hours > 12 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Неверное время. Проверьте введенные часы и минуты.");
        }

        double hourAngle = (hours % 12 + minutes / 60.0) * 30;
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}