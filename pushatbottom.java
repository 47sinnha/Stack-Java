import java.util.*;
public class pushatbottom {
    static void pushatbottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data); 
            return; 
        }
        int top = s.pop(); 
        pushatbottom(data, s);
        s.push(top); 
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1); 
        s.push(2); 

        pushatbottom(4, s);
    }
}

// Working of the above code
// Initial stack [1,2]
// 1. pushatbottom(4, [1,2]) is called
// 2. Top element 2 is popped, leaving[1]
// 3. pushatbottom(4, [1]) is called recursively 
// 4. Top element 1 is popped, leaving an empty stack 
// 5. pushatbottom(4, []) is called recursively 
// 6. Since the stack is empty, 4 is pushed onto the stack leaving[4]
// 7. The recursive call returns and 1  is pushed onto the stack, leaving[4,1]
// 8. The recursive call return again and 2 is pushed onto the stack, leaving[4,1,2]