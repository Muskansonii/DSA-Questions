package stackAndQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 public class validParenthesis {
    public  boolean ExtraBrackets(String exp) {
        // Write your code here
		Stack<Character> st=new Stack<>();
		for(int i=0;i<exp.length();i++){
			char ch=exp.charAt(i);
			int count=0;
			if(ch!=')'){
				st.push(ch);
			}
			else{
				while(!st.isEmpty() && st.peek()!='('){
					// int count=0;
					st.pop();
					count++;
				}
				st.pop();
				if(count==0){
					return true;
				}
			}
		}
      return false; 
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
	    validParenthesis Obj = new validParenthesis();
        if(Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
