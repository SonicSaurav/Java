import java.util.Arrays;

public class cyclicsort{
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(Arrays.toString((cylic(arr))));

        
    }
    static int[] cylic(int[] arr){
        int i =0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i]  = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    
}