public class MinimumSizeSubarray {
    public static void main(String[] args) {
        
    }
    static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
    int[] prefixSum = new int[n + 1]; // Prefix sum array
    for (int i = 1; i <= n; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
    }

    int minLen = n + 1; // Initialize to a value greater than the array length
    for (int i = 0, j = 0; i < n; i++) {
        while (prefixSum[i + 1] - prefixSum[j] >= target) {
            minLen = Math.min(minLen, i - j + 1);
            j++;
        }
    }

    return minLen == n + 1 ? 0 : minLen;
    }
}
