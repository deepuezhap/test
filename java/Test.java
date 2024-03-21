
class Fibo{

public static void main(String[] args){
    int a=0,b=1,c;
    System.out.print("0 1 ");

    for(int i=0;i<8;i++){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;

    }
}

}

