package linear_search;

public class search_in_str {
    public static void main(String[] args) {
        String name = "Skanda";
        char target = 'n';
        boolean ans = search(name, target);
        System.out.println(ans);
    }

    static boolean search(String str , char target){
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
