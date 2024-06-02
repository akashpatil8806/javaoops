// The super keyword in Java is a reference variable which is used to refer immediate parent class object.

class Parent{
    String name="Roy"; 
    void show(){
        System.out.println("This is super method");
    }
}
 class Son extends Parent{
    
    void info(){
        super.show();
        System.out.println("this is the information ");
        System.out.println(super.name);
    }
    
 } 

 class BCA{
    public static void main(String[] args) {
        Son s=new Son();
        s.info();
    }
 }
 //o/p 
 //This is super method
// this is the information 
//Roy