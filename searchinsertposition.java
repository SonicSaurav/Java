public class searchinsertposition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(posi(arr,7));
    }
    static int posi(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        int index = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
                index = mid;
            }else if(arr[mid]<target){
                start = mid+1;
                index = start;
            }
            else {
                return mid;
            }
        }
        return index;
    }
}
