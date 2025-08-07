package com.day_8;
import java.util.*;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 10;
		Integer obj = Integer.valueOf(num);
		Integer obj1= num;
		System.out.println("Boxed Integer: " + obj);
		System.out.println("Boxed Integer: " + obj1);
		
		int unboxedNum = obj.intValue();   
        int autoUnboxedNum = obj1;     
        System.out.println("Unboxed int: " + unboxedNum);
        System.out.println("Auto-unboxed int: " + autoUnboxedNum);
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);          
        list.add(15);
        list.add(25);
        
        System.out.println("ArrayList values:");
        for (Integer val : list) {
            System.out.println(val); 
        }

	}

}
