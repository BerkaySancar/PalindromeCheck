import java.util.Scanner;

public class PalindromeWords {

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = scan.nextLine();

        System.out.println("Is Palindrome? -> " + isPalindrome(word));


    }
}
