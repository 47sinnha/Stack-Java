public class stackoperation {
    static class Node{
        int data; 
        Node next; 
        public Node(int data){
            this.data = data; 
            next = null; 
        }
    }

    static class Stack{
        public static Node head; 
        public static boolean isempty(){
            return head == null; 
        }
        public static void push(int data){
            Node newNode = new Node(data); 
                if(isempty()){
                    head = newNode; 
                    return; 
                }
                newNode.next = head; 
                head = newNode; 
            }
        
        public static int pop(int data){
            int top = head.data; 
            head = head.next; 
            return top; 
        }    

        public static int peek(int data){
            if(isempty()){
                return -1; 
            }
            return head.data; 
        }
    }
        public static void main(String[] args) {
            Stack s = new Stack(); 
            s.push(1); 
            s.push(2); 
            s.push(3); 

            while (!s.isempty()) {
                System.out.println(s.peek());
                s.pop(); 
            }
        }
    }
