import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        try {
            if (args[0].equals("copy")) {
                FileInputStream in = new FileInputStream(args[1]);
                FileOutputStream out = new FileOutputStream(args[2]);
                int c;
                while ((c = in.read()) != -1) out.write(c);
                in.close();
                out.close();
            } else if (args[0].equals("delete")) {
                new File(args[1]).delete();
            } else if (args[0].equals("rename")) {
                new File(args[1]).renameTo(new File(args[2]));
            }
            
            File f = new File(args[1]);
            System.out.println(f.getName() + " " + f.getAbsolutePath() + " " + f.length() + " " + f.canRead() + " " + f.canWrite() + " " + f.lastModified());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
