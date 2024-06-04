package ExcepationHandling;

public class NesetedExcepation {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=5;
            int c=a/b;
            System.out.println(c);
            try{
            int arr[]={2,4,5};
            System.out.println(arr[9]);
            }
            catch(IndexOutOfBoundsException f){
                System.out.println("error");
            }

        } 
        catch(Exception e){
            System.out.println(" this code have errror");
        }
        {


        }
    }
}
