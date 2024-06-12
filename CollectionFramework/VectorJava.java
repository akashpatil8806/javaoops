package CollectionFramework;
import java.util.*;  

public class VectorJava {
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("akash");  
v.add("Sam");  
v.add("Santosh");  
v.add("Rahul");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
    

