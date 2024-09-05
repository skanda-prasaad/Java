package pattern;

public class p1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

