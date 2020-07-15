// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        int max = 0;
        int ret = A[0];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
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
                ret = A[i];
            }
        }
        
        if(max <= n/2)
        {
            return 0;
        }
        
        int cnt = 0;
        int res = 0;
        
        for(int i=0;i<n;i++)
        {
            if(A[i] == ret)
            {
                cnt++;
            }
            if((cnt > (i+1)/2) && (max-cnt > (n-i-1)/2))
            {
                // System.out.println("i: " + i + " cnt: " + cnt + " max: " + max);
                res++;
            }
            
        }
        return res;
    }
}