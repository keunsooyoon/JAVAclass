package JavaClass;

import java.util.*;

public class Queue {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();

        ls.offer("홍길동");
        ls.offer("김동자");        
        ls.offer("유명한");
        ls.offer("천세원");

        System.out.println("Size = " +ls.size());

        while(ls.peek() != null)  
            System.out.println(ls.poll());  

        System.out.println("Size = " + ls.size());       

    }
}
