import java.io.*;

public class FileReadComparison {
    public static void main(String[] args) throws Exception {
        String path = "largefile.txt"; 

        long t1 = System.nanoTime();
        try (FileReader fr = new FileReader(path)) {
            while (fr.read() != -1);
        }
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(path))) {
            while (isr.read() != -1);
        }
        long t4 = System.nanoTime();

        System.out.printf("FileReader: %.1f ms | InputStreamReader: %.1f ms\n",
                (t2 - t1) / 1e6, (t4 - t3) / 1e6);
    }
}
