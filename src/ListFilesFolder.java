import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ListFilesFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("./src");
        File[] files = folder.listFiles();
        List<String> filesList = new ArrayList<String>();

        System.out.println("--------List of files--------");
        for (File f: files) {
            System.out.println(f.getName());

            filesList.add(f.getName());
        }

        System.out.println("------List of files with pattern matching in name--------");
        String[] list = folder.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.contains("Array"))
                    return true;
                else
                    return false;
            }
        });

        for(String f:list){
            System.out.println("java file with Array in name: " + f);
        }

        System.out.println("------Check if file exists--------");
        File test = new File("./src/test.java");
        if (test.exists())
            System.out.println("file exists");
        else
            System.out.println("file doesn't exist");


        System.out.println("------Check if file has permission right--------");
        File filePermissions = new File("./src/HashMapInit.java");
        if (filePermissions.canWrite())
            System.out.println("can write");
        else
            System.out.println("cannot write");
        if (filePermissions.canRead())
            System.out.println("can read");
        else
            System.out.println("cannot write");

        System.out.println("------directory or file--------");
        if (filePermissions.isDirectory())
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println("------Get las modified file--------");
        Date date = new Date(filePermissions.lastModified());
        System.out.println("The file : " + filePermissions.getName() + " was last modified in " + date);


        System.out.println("--------List of files with details--------");
        for (File f: files) {
            Date date2 = new Date(f.lastModified());
            System.out.println("The file : " + f.getName() + " was last modified in " + date2);
        }

        File yourFile = new File("./src/files_names.txt");
        yourFile.createNewFile(); // if file already exists will do nothing


        Path myFile = Paths.get("./src/files_names.txt");

        BufferedWriter bw = null;

        try {
            //Specify the file name and path here
            File file = new File("./src/files_names.txt");

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (String s: filesList) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }

        /*
        System.out.println("--------Directories creation--------");
        System.out.println("--------Arrays exercices directory--------");
        File file = new File("./src/arrays_exercices");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }

        System.out.println("--------Hasmap exercices directory--------");
        Path path = Paths.get("./src/hashmap_exercices");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
        */
    }
}
