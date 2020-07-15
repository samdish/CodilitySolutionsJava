// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        HashSet<Integer> hs = new HashSet<>();
        
        int s = (X*(X+1))/2;
        // System.out.println("s: " + s);
        // int s = (int) s1;
        int s2 = 0;
        
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(A[i]))
            {
                hs.add(A[i]);
                s2 += A[i];
                // System.out.println("s2: " + s2);
                if(s2 == s)
                {
                    return i;
                }
            }
        }
        
        return -1;
    }
}