package pattern;

public class FloydsTriangle {
    public static void main(String[] args) {
        int counter = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter);
                counter++;
            }
            for (int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
