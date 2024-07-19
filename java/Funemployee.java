import java.util.Scanner;

class Emp{
    int id;
    String name;
    Emp(int x,String name){
        id =x;
        this.name= name;

    }
   void display()
   {
    System.out.println(id);
    System.out.println(name);

   }
}
public class Funemployee {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a =sc.nextInt();
        sc.nextLine();
        
        Emp[] emp = new Emp[a];

        for(int i =0;i<a;i++)
        {
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();

            emp[i] = new Emp(id,name);

        }
        System.out.println("search id  is : ");
        int item = sc.nextInt();
        sc.close();
        
        int i=0;
        for(i =0;i<a;i++)
        {  
            if(emp[i].id == item)
            {
            break;
            }
        }

        emp[i].display();
      
        

    }
    
}
