public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        String result = input.replaceAll(String.valueOf(toRemove), "");
        System.out.println("Modified String: " + result);
    }
}
