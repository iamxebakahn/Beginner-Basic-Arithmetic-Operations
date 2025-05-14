// Problem Description

// Print the following
// 2 Two 4 Four 6 Six


// Output Format

// Print the numbers with the text.


// Example Output

// 2 Two 4 Four 6 Six

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
