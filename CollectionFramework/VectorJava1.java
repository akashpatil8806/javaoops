package CollectionFramework;

import java.util.*;  
public class VectorJava1
{

public static void main(String args[]){  
Vector<Integer> al=new Vector<Integer>();  
al.add(1);  
al.add(3);  
al.add(4);  
al.add(5);  
Iterator<Integer> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}

    

