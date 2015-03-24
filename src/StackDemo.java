import java.util.Stack;


public class StackDemo {
public static void main(String[]args)
{
  Stack s = new Stack();	
  s.add(new Integer(2));
  s.add(new String("nikita"));
  s.push("shah");
  s.push(4);
  
  System.out.println(s);
  System.out.println(s.peek());
  System.out.println(s.pop());
  
  Stack<String> s1= new Stack<String>();
  s1.push("nikita");
  s1.push("rocks");
  System.out.println(s1);
  
}
}
