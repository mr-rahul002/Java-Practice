package Stack;
import java.util.Stack;
public class ValidStack {
    public static void main(String[] args) {
        String exp="{{}}";
        System.out.println(isValidParenthesis(exp));;

    }



    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
      
 Stack<Character> stack= new Stack<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='('|| expression.charAt(i)=='['|| expression.charAt(i)=='{'){
                stack.push(expression.charAt(i));
                continue;
            }
            //
            if(expression.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!='('){
                    return false;
                }
            }
            else if(expression.charAt(i)=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!='{'){
                    return false;
                }
            }
            else if(expression.charAt(i)==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!='['){
                    return false;
                }
            }
            
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}