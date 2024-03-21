class Prime {

    public static void main(String[] args)
    {
        int n=10,f=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
            {
                f=1;
                break;
            }
            
        }

        if(f==1){
            System.out.println("Not Prime ");
        }
        else{
            System.out.println("it is Prime ");


        }
    }


}
