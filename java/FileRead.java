import java.io.*;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
        File f = new File("sample.txt");
        Scanner sc= new Scanner(f);
            while(sc.hasNextLine()){
                int a=sc.nextInt();
                if(a%2==0){
                System.out.println(a);
                }
            }
            sc.close();
        
    }catch(Exception e){}
        
    }
}
