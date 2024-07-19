import java.util.*;
public class PriorityQ{
    public static void main(String args[]){
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("dom");
    pq.add("zoe");
    pq.add("car");
    pq.add("alida");
    System.out.println(pq);
    pq.remove("dom");
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);

    System.out.println(pq.peek());

    System.out.println(pq.contains("caraa"));


    }
}