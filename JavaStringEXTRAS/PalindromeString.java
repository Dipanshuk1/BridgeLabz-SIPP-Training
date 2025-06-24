public class PalindromeString {
    public static void main(String[] args) {
        String input = "Madam";
        boolean isPalindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
