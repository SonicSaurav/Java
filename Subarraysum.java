public class Subarraysum{
    public static void main(String[] args) {
        int[] arr = {1,-1,0};
        int target = 0;
        System.out.println(number(arr,target));
    }
    static int number(int[] arr,int target){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0; 
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}