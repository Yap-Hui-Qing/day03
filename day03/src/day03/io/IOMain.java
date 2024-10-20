package day03.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;


public class IOMain {
    public static void main(String[] args)
     throws FileNotFoundException, IOException {
        File file = new File(args[0]);
        // throws an exception
        InputStream is = new FileInputStream(file);

        DataInputStream dis = new DataInputStream(is);

        int totalWords = 0;

        while (true){
            String line = dis.readLine();
            if (null == line){
                break;
            }
            System.out.printf(">>> line: %s\n", line.toUpperCase());
            String[] words = line.split(" ");
            totalWords += words.length;
        }
        System.out.printf(">>> number of words: %d\n", totalWords);


        // // CREATE A BUFFER
        // byte[] buffer = new byte[1024];

        // //read the file
        // int bytesRead = 0;
        // int total = 0;
        // while ((bytesRead >= 0)){
        //     // return -1 if end of line is reached
        //     bytesRead = is.read(buffer);
        //     if (bytesRead >= 0){
        //         total += bytesRead;
        //     }
        //     System.out.printf(">>> bytes read: %d\n", bytesRead);
        // }

        // after reading, close the stream
        is.close();


    }
}
