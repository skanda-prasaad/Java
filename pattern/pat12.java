package pattern;

public class pat12 {
    public static void main(String[] args) {
        int spaces = 0;
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
        spaces = 8;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
    }
}
