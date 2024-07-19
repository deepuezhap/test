class Multiplication implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println(i*5 + "From 1st thread !");
        try{Thread.sleep(2000);
        }
        catch(Exception e){

        }
        }
    }

}
class Normal implements Runnable{
    public void run(){
        
        for(int i=0;i<100;i++){

        
        System.out.println(i + "From 2st thread !");


        try{Thread.sleep(1000);
        }
        catch(Exception e){      
        }
        }
    }

}


public class Runnablee {
    public static void main(String args[]){
        System.out.println("hei");
        Multiplication m =new Multiplication();
        Thread T1 = new Thread(m);
        T1.start();
        Normal n = new Normal();
        Thread T2 = new Thread(n);
        T2.start();
    }
}
