import java.util.Scanner;
class Matrix{
    int ar[][];
    int x,y;
    Scanner sc = new Scanner(System.in);
    Matrix(int x,int y){
        this.x=x;
        this.y=y;
        ar = new int[x][y];
        }
        
    void get(){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                ar[i][j]=sc.nextInt();
            }
        }
    }
    static Matrix multiply(Matrix m1,Matrix m2){
        Matrix m3 = new Matrix(m1.x, m2.y);
        if(m1.y==m2.x){  
        for(int i=0;i<m1.x;i++){
            for(int j=0;j<m2.y;j++){
                for(int k=0;k<m1.y;k++){
                    m3.ar[i][j]+=m1.ar[i][k] * m2.ar[k][j];
                }

            }
        }

        return m3;
    }
    else
    {
        return m3;
    }
    }


    void display(){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

}


public class Matrixmultiplication{
    public static void main(String[] args){
       
        Matrix m1 = new Matrix(2,3);
        m1.get();
        m1.display();
        Matrix m2 = new Matrix(3,2);
        m2.get();
        m2.display();
        Matrix m3 = Matrix.multiply(m1, m2);
        m3.display();
    }


}
//SYMMETRIC or not
// boolean f;
//         for(int i=0;i<a;i++)
//         {
//             for(int j=0;j<b;j++){
        
//                 if(ar[i][j]!=ar[j][i])
//                 {
//                     f=true;
//                     break;
//                 }
            
        
//         }
//         }