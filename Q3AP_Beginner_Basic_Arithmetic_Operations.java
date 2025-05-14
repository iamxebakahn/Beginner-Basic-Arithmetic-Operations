// Problem Description

// Print first five multiples of 3 that is :
// 3 6 9 12 15


// Problem Constraints

// No constraints.


// Input Format

// No need to take input.


// Output Format

// Print 3 6 9 12 15 in single line, keep space between every multiple.


// Example Input

// No input reuired.


// Example Output

// Output :
// 3 6 9 12 15
import java.lang.*;
import java.util.*;

public class Q3AP_Beginner_Basic_Arithmetic_Operations{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=5;i++)
        {
            System.out.print(i*3);
                if(i!=5)
                    {
                        System.out.print(" ");
                    }
        }
    }
}
