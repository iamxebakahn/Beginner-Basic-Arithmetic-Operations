import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_Basic_Arithmetic_Operations{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=9;i++)
        {
            if((i%2)!=0)
             {
                 System.out.print(i);
                 if(i!=9)
                    System.out.print(" ");
             }
        }
        
    }
}