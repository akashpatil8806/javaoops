
package ExcepationHandling;
public class Throws {
    void agevalidte(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible for voting");
        }
        else{
            System.out.println("you are eligible for voting");
        }
        
    }
    public static void main(String[] args) {
        Throws o=new Throws();
        o.agevalidte(12);
    }
    
}
//java.lang.ArithmeticException: You are not eligible for voting