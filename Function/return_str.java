package Function;

public class return_str {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = " HI THERE";
        return greeting;
    }
}
