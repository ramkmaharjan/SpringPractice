package com.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList<String> ll = new LinkedList<String>();
      // add elements to the linked list
      ll.add("F");
      ll.add("B");
      ll.add("D");
      ll.add("E");
      ll.add("C");
     
//      ll.addLast("Z");
//      ll.addFirst("A");
//      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);
      
     System.out.println("Middle content:"+ ll.get(ll.size()/2));

      System.out.println("Alternate , Effective Method");
       List<String> xx = getMiddle(ll);
       System.out.println("Mid Element:" + xx);

      
   }
   
   public static List<String> getMiddle(List<String> linkedSemantics) { 
	           Iterator<String> firstIterator=linkedSemantics.iterator(); 
	           Iterator<String> secondIterator=linkedSemantics.iterator(); 
	           List<String> middleNumbers=new ArrayList<String>(); 
	           while(firstIterator.hasNext()) { 
	               secondIterator.next(); 
	               if(!secondIterator.hasNext()) { 
	                   // LinkedList has odd n; return the center. 
	                   middleNumbers.add((String)firstIterator.next()); 
	                   break;
	               } else { 
	                   secondIterator.next(); 
	                   if(!secondIterator.hasNext()) { 
	                       // LinkedList has even n; return the two center things. 
	                       middleNumbers.add((String)firstIterator.next()); 
	                       middleNumbers.add((String)firstIterator.next()); 
	                       break;
	                   } 
	               } 
	               firstIterator.next(); 
	           } 
	           return middleNumbers; 
	       } 
	    
}