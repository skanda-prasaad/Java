import java.rmi.server.RMISocketFactory;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        int num_arr = arr.length;
        int ans = binary(arr, num_arr, key);
        if (ans != -1){
            System.out.println("Key found at index: " + ans);
        }else{
            System.out.println("key not found");
        }
    }
    static int binary(int arr[], int n, int target){
       int high = n-1;
       int low = 0;
       while(low <= high){
           int mid = (low+high)/2;
           if(target == arr[mid]) return mid;
           else if(target > arr[mid]) {
               low = mid + 1;
           }
           else{
               high = mid-1;
           }
       }
       return -1;

    }
}
