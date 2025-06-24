public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
