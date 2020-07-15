// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        int cnt = 0;
        
        if(X==Y)
        {
            return 0;
        }
        
        // while(X<Y)
        // {
        //     X += D;
        //     cnt++;
        // }
        
        // if(X%D!=0)
        // {
        //     cnt++;
        // }
        
        // cnt += (Y-X)/D;
        
        if((Y-X)%D == 0)
        {
            cnt += (Y-X)/D;
        }
        else
        {
            cnt += (Y-X)/D + 1;
        }
        
        return cnt;
    }
}