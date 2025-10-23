package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    
    public int climbStairs(int n) {
        return climbStairs(n, new HashMap<>());
    }

    public int climbStairs(int n, Map<Integer, Integer> dic) {
        if (n == 1 || n == 0)
                dic.put(n, 1);
        if (dic.containsKey(n) == false) {
            // Fibonnacci
            dic.put(n, climbStairs(n-1, dic) + climbStairs(n-2, dic));
        }

        return dic.get(n);        
    }

}
