package Function;

public class Function_Overloading {
    public static void main(String[] args) {
        same(5);
        same("Skanda");
    }

    static void same(int a){
        System.out.println(a);
    }

    static void same(String name){
        System.out.println(name);
    }
}

///// Function can have same name only if their arguments are different.

