import java.util.Scanner;
class NegativeException extends RuntimeException{
    NegativeException(){
        super("no negative numbers allowed");
    }

}
public class Exceptionexample {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the size : ");
    int n = sc.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    try{
        if(ar[i]<0){
            throw new NegativeException();
        }
    }
    catch(NegativeException Ne){
        System.out.println(Ne);
        i--;

    }

    }
    sc.close();
  

    }
}
