class Multiplication extends Thread{
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
class Normal extends Thread{
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


public class Threads {
    public static void main(String args[]){
        System.out.println("hei");
        Multiplication m =new Multiplication();
        m.start();
        Normal n = new Normal();
        n.start();
    }
}
