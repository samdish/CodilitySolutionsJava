// you can also use imports, for example:
// import java.util.*;
import java.lang.Math;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        
        int[] max_ending = new int[n];
        int[] max_starting = new int[n];
        
        for(int i=1;i<n-1;i++)
        {
            max_ending[i] = Math.max(0, max_ending[i-1] + A[i]);
        }
        
        for(int i=n-2; i>0; i--)
        {
            max_starting[i] = Math.max(0, max_starting[i+1] + A[i]);
        }
        
        int max = 0;
        
        for(int i=1;i<n-1;i++)
        {
            int temp = max_ending[i-1] + max_starting[i+1];
            if(temp > max)
            {
                max = temp;
            }
        }
        
        return max;
    }
}