// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        int res = 0;
        int max = 0;
        
        for(int i=n-1;i>=0;i--)
        {
            if(A[i]>max)
            {
                max = A[i];
            }
            
            if(max-A[i]>res)
            {
                res = max-A[i];
            }
        }
        
        return res;
        
    }
}