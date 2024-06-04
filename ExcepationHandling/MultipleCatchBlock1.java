package ExcepationHandling;
public class MultipleCatchBlock1{
    public static void main(String[] args) {
        try{
            // In the code  gives arthimetic error
            // int a=10; int b=0; int c;
            // c=a/b; 
             

            int arr[]={1,3,6};
            int aa= arr[10];



        }
        catch(ArithmeticException e){
            System.out.println("in the code have the arithmetic error");

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("in the code have the index error");

        }
        catch(NullPointerException e){
            System.out.println("in the code have nullpointer error");

        }
        catch(Exception e){
            System.out.println("In the code have error");
        }
    }

}