import java.util.*;

class Stack<T>{
    int top=-1;
    ArrayList<T> ar = new ArrayList<>();


    void push(T item){
        top++;
        ar.add(item);
    }

    void pop(){
        System.out.println("element is popped " + ar.get(top));
        ar.remove(top);
        top--;
    }

    void top(){
        System.out.println("Top element is " + ar.get(top));
    }

    void display(){
        for(T i : ar){
            System.out.print(i+" ");
        }
        System.out.println();

    }



}
public class Genericstack {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println();
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.display();
        s1.pop();
        s1.display();
        s1.top();

        Stack<String> s2 = new Stack<>();
        s2.push("deepu");
        s2.push("Alida");
        s2.push("Aramu");
        s2.display();
        s2.pop();
        s2.display();
        s2.top();
        System.out.println(s1.ar);
        
        
        
    }
}

