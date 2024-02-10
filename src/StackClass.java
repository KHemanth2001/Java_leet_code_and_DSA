import java.util.*;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
//        addBottom(s,4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    public static void addBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int n=s.pop();
        addBottom(s,data);
        s.push(n);


    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int n=s.pop();
        reverseStack(s);
        addBottom(s,n);
    }

}
