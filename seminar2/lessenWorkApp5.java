package seminar2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class lessenWorkApp5 {
    public static void main(String[] args) {
        String dir = "seminar2";
        String fil = "log.txt";
        ArrayList<String> list = setFile(dir);
        recordFile(dir + "/" + fil, list);
        readerFile(dir + "/" + fil);     
    }

    public static void readerFile(String filePatch) {
        String line = "empty";
        try {
            File file = new File(filePatch);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                
                while ((line = bufReader.readLine()) != null) {
                    System.out.printf("== %s ==\n", line);
                }
                bufReader.close(); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> setFile(String filePatch) {
        File dir = new File(filePatch);
        File[] filesList = dir.listFiles();
        ArrayList<String> list = new ArrayList<>();
        for (File file : filesList) {
            if (file.isFile()) {
                list.add(file.getName());
            }
        }

        return list;
    }

    public static void recordFile(String filePatch, ArrayList<String> list) {
        try (FileWriter fw = new FileWriter(filePatch, false)) {
            for (String o : list) {
                fw.write(o + "\n");
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
