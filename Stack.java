package JavaClass;

import java.util.*;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<Integer>();

        System.out.println("Stack created :");

        for(int i = 0; i <10;i++)
        s.push(new Integer(i));


        System.out.println("1pop:" + s.pop());        
        System.out.println("2pop:" + s.pop());       
        System.out.println("3pop:" + s.pop());       
        System.out.println("4pop:" + s.pop());  

        System.out.println("stack top :" + s.peek());       

    }
}
