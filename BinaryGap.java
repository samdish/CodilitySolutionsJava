// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        
        // String b = "";
        while(N%2==0)
        {
            N /= 2;
        }
        
        
        
        String b = Integer.toBinaryString(N);
        // System.out.println("b: " + b);
        // long n = Long.parseLong(b);
        // System.out.println("N: " + N);
        // while(n>0 && n%10 == 0)
        // {
        //     n /= 10;
        // }
        // System.out.println("N: " + N);
        int cnt = 0;
        int max = 0;
        // boolean isValid = false;
        // b = Integer.toString(n);
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i) == '0')
            {
                cnt++;
                
                if(cnt > max)
                {
                    max = cnt;
                }
            }
            else
            {
                cnt = 0;
                // if(max > 0)
                // {
                //     isValid = true;
                // }
            }

        }
        
        // if(isValid)
        return max;

        // return 0;
    }
}
