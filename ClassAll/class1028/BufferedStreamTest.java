package ClassAll.class1028;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BufferedStreamTest {
    static String path="C:\\py\\bs.txt";
    public static void main(String[] args) {
        printer();
    }
    public static void printer(){
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.println("asdasdasadasd");
            pw.println("qwoieqoiweuqoi");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
