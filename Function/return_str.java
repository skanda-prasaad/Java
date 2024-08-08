package Function;

import java.util.Scanner;

public class return_str {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name :-");
        String name = input.nextLine();
        String message = greets(name);
        System.out.println(message);
        input.close();
    }

    static String greet(){
        String greeting = " HI THERE";
        return greeting;
    }
    // new function :- 
    static String greets(String a){
        String greeeets = "Hello " + a;
        return greeeets;
    }


}

