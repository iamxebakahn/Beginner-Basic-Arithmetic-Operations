import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Basic_Arithmetic_Operations{
    public static void main(String[] args)
    {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        for(int i=2;i<=6;i=i+2)
        {
            
            System.out.print(i+" ");
            switch(i)
            {
                case 2: System.out.print("Two ");
                        break;
                case 4: System.out.print("Four ");
                        break;
                case 6: System.out.print("Six");
                        break;
            }
        }


    }
}