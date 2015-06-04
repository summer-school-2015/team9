import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

/**
 * Created by User on 04/06/2015.
 */
public class Compare {
    //Path file = Paths.get("C:\\Users\\User\\MyGit\\team9\\Task");
    public static void main(String[] args) throws IOException

    {

        try {
            File f = new File("C:\\Users\\User\\MyGit\\team9\\Task");
            OutputStream fstream = new FileOutputStream(f);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        System.out.print("");
    }



}
