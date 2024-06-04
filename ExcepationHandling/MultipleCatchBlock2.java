package ExcepationHandling;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println("the string is::" + str);

        }

        catch (ArithmeticException e) {
            System.out.println("this is Arithmetic Erroi");

        } catch (IndexOutOfBoundsException rOutOfBoundsException) {
            System.out.println("this is the index error");
        } catch (Exception f) {
            System.out.println("main excepation occurs");
        }

    }
}
