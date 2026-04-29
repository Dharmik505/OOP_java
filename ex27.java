import java.io.*;

public class StudentFileIO {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("1 John 85\n");
            bw.write("2 Alice 90\n");
            bw.write("3 Bob 78\n");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Done");
        }
    }
}
