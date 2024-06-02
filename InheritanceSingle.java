
// Base or Super Class
class Employee {
    void Emp(){
        int salary = 60000;
        System.out.println(salary);
    }
   
    
}

// Inherited or Sub Class
class Engineer extends Employee {
    void Emp2(){

        int benefits = 10000;
        System.out.println(benefits);
    }
    
}

// Driver Class
class Gfg {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        E1.Emp2();
        E1.Emp();
       
    }
}