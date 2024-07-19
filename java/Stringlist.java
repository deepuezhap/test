import java.util.*;


public class Stringlist {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    ArrayList<String> ar = new ArrayList<>();

    while(true){
        System.out.println("1.Add new String \n 2.Remove \n 3.Exit");
        int ch = sc.nextInt();
        sc.nextLine();
        
        switch(ch){
            case 1 : System.out.println("Enter name to be added"); 
                    String name = sc.nextLine();

                    ar.add(name);
                    System.out.println(ar);
                    break;
            
            case 2 : System.out.println("Enter number  to be dlted"); 
                     int num = sc.nextInt();
                    ar.remove(num);
                    System.out.println(ar);
                    break;
            case 3 : System.exit(0);
          
            default : System.out.println("ivalid input");
        }

    }

    }
}
