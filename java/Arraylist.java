import java.util.*;
public class Arraylist {
    public static void main(String args[])
    {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("deepu");
        ar.add("alida");
        ar.add("ramu");
        ar.add("selfi");


        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
        System.out.println(ar.indexOf("ramu"));

        if(ar.contains("deepu")){
            System.out.println("yepp");
        }
        ar.remove("deepu");  
        System.out.println(ar);
        ar.remove(0);  
        System.out.println(ar);


    }
}
