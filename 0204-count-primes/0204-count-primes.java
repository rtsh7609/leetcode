class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] seen = new boolean[n];
        int ans = 0;

        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            ans++;
            if ((long)num * num >= n) continue;  // Prevent overflow
            for (int mult = num * num; mult < n; mult += num) {
                seen[mult] = true;
            }
        }

        return ans;
    }
}