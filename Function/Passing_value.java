package Function;

/**
 * Passing_value
 */
public class Passing_value {

    public static void main(String[] args) {
        String name = "Skanda Prasad";
        changename(name);
        System.out.println(name);
    }
    static void changename(String New){
        New = "Hello There"; /// Not changing becz its creating new name;
    }
}