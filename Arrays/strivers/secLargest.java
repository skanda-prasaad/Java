package Arrays.strivers;

public class secLargest {
    public static void main(String[] args) {
         int[] arr = new int[]{1,2,3,4,7,7,5};
         int largest = arr[0];
         int slargest = -1;
        for (int j : arr) {
            if (j > largest) {
                slargest = largest;
                largest = j;
            } else if (j > slargest && j < largest) {
                slargest = j;
            }
        } System.out.println("The second largest number is: " + slargest);
    }
}
