package CollectionFramework;
import java.util.*;

// import java.util.HashSet;

public class Hashset {
    public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Akash");  
set.add("Vijay");  
set.add("Akash");  
set.add("Ajay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
    
}
