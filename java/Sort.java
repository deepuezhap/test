public class Sort {
    public static void main(String args[]){
        String ar[]={"zoe","Aldia","Deepu","aanand"};
        for(int i =0 ;i<4;i++){
            System.out.print(ar[i]+ " ");
        }
        String temp;
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(ar[i].compareToIgnoreCase(ar[j])>0)
                {
                    temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                    
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array is ");
        for(int i =0 ;i<4;i++){
            System.out.print(ar[i]+ " ");
        }



    }
}
