package Loops.conditionals;

public class syntax {
    public static void main(String[] args) {
        /*
         * Syntax of if statements :-
         * if(boolean expression T or F){
         * body }
         * else {
         * do this
         * }
         */
        //// Salary example //
        int salary = 25000;

        if (salary > 15000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
