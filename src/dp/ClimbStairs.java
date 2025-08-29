package org.oooooomy.dp;

/**
 * 70. 爬楼梯
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        return dfs(n);
    }

    public int dfs(int n) {
        if (n <= 1) {
            return 1;
        }
        return dfs(n - 1) + dfs(n - 2);
    }

}
