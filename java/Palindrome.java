public class Palindrome {
    public static void main(String[] args)
    {
        int num=123321,temp,rem,rev=0;
        temp=num;

        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(temp);

        System.out.println(rev);
        if(rev==temp)
        {
            System.out.println("It is Palindrome ");

        }
        else
        {
            System.out.println("It is not ");
        }


    
    }
}
