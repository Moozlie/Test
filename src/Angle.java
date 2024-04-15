public class Angle {
    public double calculateAngle(int hours, int minutes) {
        if (hours >= 12) {
            hours -= 12;
        }

        double hourAngle = 0.5 * (hours * 60 + minutes);
        double minuteAngle = 6 * minutes;

        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(360 - angle, angle);

        return angle;
    }

    public static void main(String[] args) {
        Angle angel = new Angle();
        int hours = 11;
        int minutes = 54;
        double result = angel.calculateAngle(hours, minutes);
        System.out.println("Угол между часовой и минутной стрелками в " + hours + " часов " + minutes + " минут: " + result + " градусов");
    }
}
