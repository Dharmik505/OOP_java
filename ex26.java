import java.io.*;

public class FileCounter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            int chars = 0, words = 0, lines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] wordsArray = line.trim().split("\\s+");
                if (wordsArray.length > 0 && !wordsArray[0].isEmpty()) {
                    words += wordsArray.length;
                }
            }
            System.out.println(chars + " " + words + " " + lines);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
