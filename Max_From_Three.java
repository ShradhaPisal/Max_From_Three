import java.lang.*;
import java.util.*;
public class Max_From_Three
{
    public static void main(String [] args)
    {
        int A=0, P=0, Q=0;
        Scanner Sc=new Scanner(System.in);

        System.out.print("\n Enter First Number : ");
        A=Sc.nextInt();

        System.out.print("\n Enter Second Number : ");
        P=Sc.nextInt();

        System.out.print("\n Enter Third Number : ");
        Q=Sc.nextInt();

        if(A == P)
        {
            System.out.print("\n Both Numbers are equal ");
        }
        else if(P == Q)
        {
            System.out.print("\n Both Numbers are equal ");
        }
        else if(A == Q )
        {
            System.out.print("\n Both Numbers are equal ");
        }
        else if(A > P)
        {
            System.out.print("\n Number " + A + " is Maximum ");
        }
        else if(P > Q)
        {
            System.out.print("\n Number " + P + " is Maximum ");
        }
        else if(Q > A)
        {
            System.out.print("\n Number " + Q + " is Maximum ");
        }
        System.out.print("\n Thanks..!!! ");
    }
}