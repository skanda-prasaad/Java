package Arrays.Questions;

public class Pairs {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8,10};
        for (int i = 0; i <= nums.length-1; i++){
            for(int j = i+1; j<= nums.length - 1 ;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }
}
