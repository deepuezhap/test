class Complex{
    int real,image;
    public Complex(int a,int b)
    {
        this.real =a;
        this.image= b;

    }

    public void display(){
        System.out.println(this.real + " + " + this.image + "i");

    }

    
}

public class Complexsum{
    
    public static void add(Complex a , Complex b){
        int real = a.real + b.real;
        int image = a.image + b.image;
        
        System.out.println(real + " + " + image + "i");
        
    }
 

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        Complex a = new Complex(4,5);
        Complex b = new Complex(2,7);
        a.display();
        b.display();
        add(a,b);
        

    
    }
}

