package CollectionFramework;
import java.util.*; 
public class StackInCollection { 
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("akash");  
stack.push("sam");  
stack.push("Amit");  
stack.push("rahul");  
stack.push("swpanil");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
    

