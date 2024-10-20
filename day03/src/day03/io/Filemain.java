package day03.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filemain {
    public static void main(String[] args) {
        System.out.printf("args length = %d\n", args.length);

        if (args.length <= 0){
            System.err.println("Please provide a file name");
            System.exit(1);
        }

        // loop through the files and print their info
        for (String s:args){
            System.out.printf("\n>>> Processing %s\n", s);
            // another way to get file
            // Path p = Paths.get(s);
            // File file = p.toFile();
            
            File file = new File(s);
            System.out.printf("path: %s\n", file.getAbsolutePath());
            // path: C:\Users\Hui Qing\Visa\Software Development Fundamentals\day03\catinthehat.txt
            System.out.printf("is file: %s\n", file.isFile());
            System.out.printf("exists: %s\n", file.exists());
            System.out.printf("write: %ss\n", file.canWrite());

        }

        // trying out the String[] args
        // for (int i = 0; i < args.length; i += 1){
        //     System.out.printf("%d: %s\n", i, args[i]);
        //     System.out.println(">>>");
        // }


        // for (String value : args){
        //     System.out.printf(">>> %s\n", value);
        // }
    }
}
