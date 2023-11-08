import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] numbers = {3.4, 4.5, -13.1, 4.6, -8.6, 4.3, -36.6, 16.5, 3.2, 7.5, -3.2, 0.4, -8.9, 3.1, 1.2};
        double result = 0;
        int possitive = 0;
        boolean negative = false;
        for (double element : numbers) {
            if (!negative) {
                if (element < 0) {
                    negative = true;
                }
            } else {
                if (element > 0) {
                    result += element;
                    //result = result + element
                    possitive++;
                }
            }
        }
        System.out.println(result / possitive);


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String input = in.nextLine();

        String pal = input.replaceAll("[^a-zA-Z]", " ");
        System.out.println("input length: " + input.length());

        boolean isPalindrome = true;
        int left = 0;
        int right = pal.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}