import java.io.*;

public class DataFileIO {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            int chars = 0, words = 0, lines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                String[] wordsArray = line.trim().split("\\s+");
                if (wordsArray.length > 0 && !wordsArray[0].isEmpty()) {
                    words += wordsArray.length;
                }
                for (char c : line.toCharArray()) {
                    if (c != ' ' && c != '\n') {
                        chars++;
                    }
                }
            }
            System.out.println(lines + " " + words + " " + chars);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
