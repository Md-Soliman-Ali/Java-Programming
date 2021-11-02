package file_read_write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead_Write {

    public static void main(String[] args) throws IOException {
        fileWrite();
        fileRead();
    }

    public static void fileWrite() throws IOException {
        FileWriter fw = new FileWriter("File.txt", true);
        fw.write("\nHello World");
        fw.close();
    }

    public static void fileRead() throws IOException {
        FileReader fr = new FileReader("File.txt");
        int character;

        while ((character = fr.read()) != -1) {
            System.out.print((char) character);
        }

        // System.out.println(fr.read());
        fr.close();
    }
}
