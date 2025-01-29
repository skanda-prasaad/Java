package Arrays.strivers;

public class largest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 4, 3};
        int largest = arr[0];
        for (int j : arr) {
            if (j > largest)
                largest = j;
        }
        System.out.println("Largest is : "+ largest);
    }
}
