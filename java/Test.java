import java.io.*;
public class Test {


    static void find(String path){
        File f = new File(path);
        File[] files = f.listFiles();
        for(File fu : files){
            
            if(fu.isFile()){
                System.out.println(fu.getName());
            }
            else if(fu.isDirectory()){
                find(fu.getAbsolutePath());
            }
            else{
                return;
            }
        }
        }


        static void search(String path,String name){
            File f = new File(path);
            File[] files = f.listFiles();
            for(File fu : files){
                if(fu == null){
                    return;
                }
                else if(fu.isFile() && fu.getName().equals(name)){
                    System.out.println(fu.getName());
                    System.out.println(fu.getAbsolutePath());

                }
                else if(fu.isDirectory()){
                    search(fu.getAbsolutePath(),name);
                }
                
            }
            }






    public static void main(String[] args) {
        
    
        

        find("Test");
        System.out.println("-------------");
        search("Test","inneras.txt");
            


        } 





    
}
