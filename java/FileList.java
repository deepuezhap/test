import java.io.File;
import java.util.ArrayList;

public class FileList {

    static void find(String directory, ArrayList<String> fileList) {
        File dir = new File(directory);
        File[] files = dir.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                fileList.add(file.getName());
            } else if (file.isDirectory()) {
                find(file.getAbsolutePath(), fileList);
            }
        }
    }

    static void search(String directory, ArrayList<String> fileList) {
    File dir = new File(directory);
    File[] files = dir.listFiles();

    if (files == null) {
    return;
    }
    for (File file : files) {
    if(file.isFile() && file.getName().equals("c.txt")){
    System.out.println("Found at : ");
    System.out.println(file.getAbsolutePath());

    }else if (file.isDirectory()) {
    search(file.getAbsolutePath(), fileList);
    }
    }
    }

    public static void main(String[] args) {
        ArrayList<String> fileList = new ArrayList<>();
        ArrayList<String> fileList2 = new ArrayList<>();

        find("test", fileList);

        // System.out.println("Files found:");
        // for (String file : fileList) {
        //     System.out.println(file);
        // }

        search("test",fileList2);

    }
}
