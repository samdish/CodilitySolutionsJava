// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        
        int max_ending = 0;
        int max_slice = 0;
        int max = -2147483648, cnt = 0;
        
        for(int i=0;i<n;i++)
        {
            if(A[i] < 0)
            {
                cnt++;
                if(A[i] > max)
                {
                    max = A[i];
                }
            }
            max_ending = Math.max(0, max_ending + A[i]);
            max_slice = Math.max(max_slice, max_ending);
        }
        
        if(cnt == n)
        {
            return max;
        }
        
        return max_slice;
    }
}