// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        
        int cnt = 0;
        
        int i=1;

        if(N==1)
        {
            return 1;
        }
        
        if(N==2)
        {
            return 2;
        }
        
        // System.out.println("t1: " + Math.sqrt(N));
        
        for(i=1;i<Math.sqrt(N);i++)
        {
            // System.out.println("t: " + N%i);
            if(N%i == 0)
            {
                cnt += 2;
            }
        }
        
        if(N/i == i)
        {
            cnt += 1;
        }
        
        return cnt;
    }
}