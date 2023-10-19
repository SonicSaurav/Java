import java.util.Arrays;

public class firstandlastposition {
    public static void main(String[] args) {
        int[] arr = {6,7,7,7,7,8,8,8};
        System.out.println(Arrays.toString(bs(arr,6)));

    }
    static int[] bs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1 ;
            }
            else{
               int a=  right(arr,target,mid,end);
               int b= left(arr,target,start,mid);
               return new int[] {b,a};
            }
        }
    

        return new int[] {-1,-1};
    }
    static int left(int[] arr,int target,int start,int end){
        int index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]==target){
                index = mid;
                end = mid-1;
            }
            
        }
        return index;
    }
    static int right(int[] arr,int target,int start,int end){
        int index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]==target){
                index = mid;
                start = mid+1;
            }   
            
        }
        return index;
    }
}
