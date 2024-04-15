public class Duplicate {
    public static void main(String[] args) {
        String word = "Hello";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println("Повторяющийся символ: " + chars[i]);
                    return;
                }
            }
        }
        System.out.println("Повторяющиеся символы не найдены.");
    }
}