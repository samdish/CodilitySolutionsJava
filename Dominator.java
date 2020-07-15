// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int ret = -1;
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i], hm.get(A[i]) + 1);
            }
            else
            {
                hm.put(A[i], 1);
            }
            if(hm.get(A[i]) > max)
            {
                max = hm.get(A[i]);
                ret = i;
            }
        }
        
        if(max > n/2)
        {
            return ret;
        }
        return -1;
    }
}