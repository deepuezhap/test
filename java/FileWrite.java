import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        try{
    
        FileWriter f = new FileWriter("sample.txt",false);

        for(int i =0;i<25;i++){
            
            
            f.write(Integer.toString(i));
            f.write("\n");
            
           
        }
        f.close();
    }catch(Exception e){}
        
    }
}
