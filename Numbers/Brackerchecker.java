import java.util.Stack;
import java.util.Scanner;
public class Brackerchecker {
  public static boolean isbalanced(String s){
    Stack<Character>stack=new Stack<>();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch=='{'){
        stack.push('}');
      }
      else if(ch=='['){
        stack.push(']');
      }
      else if(ch=='('){
        stack.push(')');
      }
      else if(ch=='}'||ch==']'||ch==')'){
        if(stack.isEmpty()||stack.pop()!=ch){
            return false;
        }
      }
    }
    return true;
  }  
  public static void main(String[] args) {
        String test1="{[()]}";
    System.out.println(isbalanced(test1));
  }
}