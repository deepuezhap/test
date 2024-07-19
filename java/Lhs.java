import java.util.*;

public class Lhs{
    public static void main(String args[]){
    LinkedHashSet<String> pq = new LinkedHashSet<>();
    pq.add("dom");
    pq.add("zoe");
    pq.add("car");
    pq.add("alida");
    System.out.println(pq);
    pq.remove("dom");
    System.out.println(pq);
    System.out.println(pq.contains("caraa"));


    }
}