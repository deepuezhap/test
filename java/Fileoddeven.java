import java.util.*;
import java.io.*;
public class Fileoddeven {
    
public static void main(String[] args) {
    try{
    File f = new File("sample.txt");
    FileWriter odd = new FileWriter("oddfile.txt",false);
    FileWriter even = new FileWriter("evenfile.txt",false);
    

    Scanner sc= new Scanner(f);
    while(sc.hasNextInt()){
        int num = sc.nextInt();   
        if(num%2==0){           
            even.write(Integer.toString(num));
            even.write("\n");
        }
        else{
            odd.write(Integer.toString(num));
            odd.write("\n");
        }       
    }
    even.close();
    odd.close();
    sc.close();
    }
    catch(Exception e){}

}
}
