//A class which is declared with the abstract keyword is known as an abstract class
// Abstract Classes and Methods​​ Data abstraction is the process of hiding certain details and showing only essential information to the user

abstract class Student{
     abstract void add(int a,int b);

    
}
class Teacher extends Student{
    void add(int a, int b){
        int c=a+b;
        System.out.println("the addition of two number::"+c);
        
    }
    
}

class main1{
    public static void main(String[] args) {
        Student obj= new Teacher();
        obj.add(10,10);
        
    }
}