package graphics;

public class Rectangle {
    int l,b;
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;

    }
    public void area(){
        System.out.println(l*b);
    }
}
