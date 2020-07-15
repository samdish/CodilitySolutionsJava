// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Pair{
    public long x,y;
    Pair(long x,long y)
    {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        
        Pair[] start = new Pair[n];
        
        for(int i=0;i<n;i++)
        {
            long x,y;
            // if(A[i] > 2147483647 - i)
            // {
            //     x = -2147483647;
            //     y = 2147483647;
            // }
            // else
            // {
                x = i - A[i];
                y = i + A[i];
            // }
            Pair p = new Pair(x,y);
            start[i] = p;
        }
        
        // Arrays.sort(start);
        Arrays.sort(start, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return (int) (p1.x-p2.x);
            }
        });
        // System.out.println("s: " + start[0].x + " " + start[0].y);
        
        int cnt = 0;
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(start[j].x <= start[i].y)
                {
                    if(cnt == 10000000)
                    {
                        return -1;
                    }
                    cnt++;
                }
                else
                break;
            }
        }
        
        return cnt;
        
    }
}