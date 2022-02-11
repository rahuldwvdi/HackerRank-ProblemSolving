import java.util.*;
public class Roll{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch: str.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder strbuild = new StringBuilder();
        for(Character ch: stack){
            strbuild.append(ch);
        }
        if (strbuild.length()==0)
            System.out.println("Empty String");
        
        else
            System.out.println(strbuild.toString());
    }
}
