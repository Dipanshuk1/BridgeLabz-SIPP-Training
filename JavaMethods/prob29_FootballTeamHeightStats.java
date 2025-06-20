public class prob29_FootballTeamHeightStats{

    public static void main(String[] args) {
        int[] heights = generatePlayerHeights();
        displayHeights(heights);

        int total = calculateSum(heights);
        double mean = calculateMean(total, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nTotal Height: " + total + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }
    public static int[] generatePlayerHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101 + 150); 
        }
        return heights;
    }
    public static void displayHeights(int[] heights) {
        System.out.print("Player Heights (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double calculateMean(int sum, int count) {
        return Math.round((sum / (double) count) * 100.0) / 100.0;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}
