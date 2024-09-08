package linear_search;

public class code {
    public static void main(String[] args) {
        int[] num = {1,2,6,5,3,8,9};
        int target = 3;
        int ans = linear(num, target);
        System.out.println(ans);

    }
    // Search array :- return index if found else -1
    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < 6; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
