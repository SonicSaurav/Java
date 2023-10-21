public class ContinuosSubarray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(checkSubarraySum(arr, 0));
        
    }
    static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
    if (n < 2) {
        return false;
    }

    for (int i = 0; i < n - 1; i++) {
        int sum = nums[i];
        for (int j = i + 1; j < n; j++) {
            sum += nums[j];

            if (k == 0) {
                if (sum == 0) {
                    return true;
                }
            } else if (sum % k == 0) {
                return true;
            }
        }
    }

    return false;
    }
}
