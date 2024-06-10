import java.util.*;
public class UsingFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1); 
        s.pop(); 
        while(!s.isEmpty()){
            System.out.println(s.peek());
        }
    }
}
