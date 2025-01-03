// File: FailCheckstyle.java

import java.util.*; // Unused import, wildcard imports are discouraged

public class FailCheckstyle 
{
    public static void main(String[] args) 
    {
        System.out.println( "This file should fail Checkstyle!" );
    }

    public int addNumbers( int a, int b ) 
    {
      return a+b;  // Improper spacing
    }
}
