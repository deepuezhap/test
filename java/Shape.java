class Shape2{
    
    void Area(int x){
        System.out.println(x*x);
    }
    void Area(int x,int y){
        System.out.println(x*y);
    }   
}

public class Shape {


    public static void main(String args[]){

        Shape2 obj = new Shape2();
        obj.Area(4);
        obj.Area(3,4);

    }
}
