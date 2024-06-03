package ExcepationHandling;

public class Excepetion2 {
    public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
      }
    
}
//  o/p :- java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3