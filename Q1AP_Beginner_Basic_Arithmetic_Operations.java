// Q1. Odd numbers
// Solved
// feature icon
// Get your doubts resolved blazing fast with Chat GPT Help
// Check Chat GPT
// feature icon
// Using hints except Complete Solution is Penalty free now
// Use Hint
// Problem Description

// Print first 5 odd numbers i.e. 1, 3, 5, 7, 9 using concatenation operator ( + )


// Output Format

// Print first five odd numbers separated by space.


// Example Output

// 1 3 5 7 9

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
