package ExcepationHandling;
// this is the throw throws

public class ThrowThrows{
    void add(int a,int b) throws ArithmeticException
    {
        
        
    if(b==0){
        throw new ArithmeticException();
    }
    else{
        int c=a/b;
        System.out.println(c);
    }
    }
    public static void main(String[] args) {
    ThrowThrows obj=new ThrowThrows();
    obj.add(10, 0);
        
    }
}