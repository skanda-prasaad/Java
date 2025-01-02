package pattern;

public class pat13 {
    public static void main(String[] args) {
        int spaces = 8;
        for(int i = 1; i <= 2*5 - 1;i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < spaces ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i > 5){
                spaces += 2;
            }else spaces -= 2;
        }
    }
}
