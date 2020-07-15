// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        Stack<Integer> s = new Stack<>();
        
        int n = A.length;
        int cnt = n;
        
        for(int i=0;i<n;i++)
        {
            if(B[i] == 0)
            {
                while(!s.empty())
                {
                    int t = s.peek();
                    if(A[t] < A[i])
                    {
                        s.pop();
                        cnt--;
                    }
                    else if(A[t]>A[i])
                    {
                        cnt--;
                        break;
                    }
                }
                // else
                // {
                //     s.push(i);
                // }
            }
            else
            {
                s.push(i);
            }
        }
        
        return cnt;
    }
}