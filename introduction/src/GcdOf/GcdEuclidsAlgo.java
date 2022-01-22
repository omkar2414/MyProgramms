package GcdOf;

import java.util.*;
import java.lang.*;
 
class GcdEuclidsAlgo
{
    public static int GcdOf(int m, int n)
    {
        if (m == 0)
            return n;
         
        return GcdOf(n%m, m);
    }
 
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int m, n , r;
        System.out.print("Enter Two Numbers : ");
        m = stdin.nextInt();
        n = stdin.nextInt();
        r = GcdOf(m, m);
        System.out.println("GCD Of("+m+","+n+") = " + r);
         
    }
}