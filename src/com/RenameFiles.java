package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RenameFiles
{
    public static void main(String[] argv) throws IOException
    {
//        File file=new File("D:\\rarify\\apks1.txt");    //creates a new file instance
//        FileReader fr=new FileReader(file);   //reads the file
//        BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
//        String line;
//        int i = 0;
//        while((line=br.readLine())!=null)
//        {
//            String[] s = line.split(" ");
//            System.out.println("File > "+i+" : "+s[3]);
//            Process p = Runtime.getRuntime().exec(line);
//            try {
//                p.waitFor();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            i++;
//        }
//        fr.close();    //closes the stream and release the resources

//        int r = 3/5;
//        int q = 3%5;
//        System.out.println(r +":" + q);
        File folder = new File(argv[0]);
        File[] listOfFiles = folder.listFiles();
        int i = 0;
//        String prepend = "murax";
        for(File f:listOfFiles) {
            if(f.isFile()) {
                if(!f.getAbsolutePath().endsWith(".apk")) {
                    String oldname = f.getAbsolutePath();
                    File file = new File(oldname);

                    String newName = folder + "\\" + f.getName() + ".apk";
                    File file2 = new File(newName);

                    Path fileToMovePath = Paths.get(file.toURI());
                    Path targetPath = Paths.get(file2.toURI());
                    Files.move(fileToMovePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    i++;
                }
            }
        }
    }
}
