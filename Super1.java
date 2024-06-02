// public class Super1 {
//     int a=10;
//     Super1(){
//         System.out.println(" this is the Constructor block");
//     }
// }


//     class S1 extends Super1
//     {
//         void Show(){
//             super.a;
//             System.out.println("this is also one of the method");
        
//         }
//     }
//     class main{
//         public static void main(String[] args) {
//             S1 s=new S1();
//             s.Show();
//         }
//     }// Java Program to Illustrate super keyword

class Vehicle {

	
	int maxSpeed = 120;
}


class Car extends Vehicle {
	int maxSpeed = 180;

	
	void display()
	{
		
		System.out.println("Maximum Speed: "
						+ super.maxSpeed);
	}
}


class MCA {

	// Main driver method
	public static void main(String[] args)
	{
		
		Car small = new Car();

		
		small.display();
	}
}

