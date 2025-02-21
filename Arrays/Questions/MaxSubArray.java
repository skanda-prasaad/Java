package Arrays.Questions;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8,10};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            int currSum = 0;
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    currSum += nums[k];
                    System.out.print(+nums[k]+" ");

                }
                System.out.print("Sum: "+currSum);
                System.out.println();
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                System.out.println();
            }
        }
        System.out.println("Max subarray: " + maxSum);
    }
}
