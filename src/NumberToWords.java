import java.util.Scanner;

public class NumberToWords {

    private static final String[] digitWords = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        scanner.close();

        String words = numberToWords(num);
        System.out.println("The number in words: " + words);
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return digitWords[0];
        }

        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            sb.insert(0, digitWords[digit]).insert(0, " ");
            num /= 10;
        }

        return sb.toString().trim();
    }
}

