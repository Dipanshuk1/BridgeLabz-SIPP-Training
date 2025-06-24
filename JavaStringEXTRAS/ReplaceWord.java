public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful.";
        String toReplace = "Java";
        String replacement = "Python";

        String result = sentence.replaceAll(toReplace, replacement);
        System.out.println("Modified Sentence: " + result);
    }
}
