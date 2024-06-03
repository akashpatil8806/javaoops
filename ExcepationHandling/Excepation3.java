package ExcepationHandling;

public class Excepation3 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("somthing is error");
        }
    }

}
