import java.util.*;
public class Main 
{ 
  public static boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
 
    Stack<Character> stack = new Stack<Character>();
 
    for (int i = 0; i < s.length(); i++) {
        char curr = s.charAt(i);
 
        if (map.keySet().contains(curr)&&map.keySet().contains(star)) {
            stack.push(curr);
        } else if (map.values().contains(curr)) {
            if (!stack.isEmpty() && map.get(stack.peek()) == curr&&map.get(stack.peek()) == star) {
                stack.pop();
            } else {
                return false;
            }
        }
    }
 
    return stack.isEmpty();
  }
         int top=-1; 
        boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
    
    public static void main(String[] args) 
    { 
        String s="({[*)]})"; 
        if (isValid(s)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
    } 

}