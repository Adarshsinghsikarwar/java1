package StackInJava;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        int n = str.length();
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57){
                String t1 = "" + ch;
                st.push(t1);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')'){
                while (op.peek() != '('){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    Character o = op.pop();
                    String t1 = val1 + val2 + o;
                    st.push(t1);
                }
                op.pop();
            }
            else {
                if (ch == '+' || ch == '-'){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    Character o = op.pop();
                    String t1 = val1 + val2 + o;
                    st.push(t1);
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/'){
                    if (op.peek() == '*' || op.peek() == '/'){
                        String val2 = st.pop();
                        String val1 = st.pop();
                        Character o = op.pop();
                        String t1 = val1 + val2 + o;
                        st.push(t1);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (st.size() > 1){
            String val2 = st.pop();
            String val1 = st.pop();
            Character o = op.pop();
            String t1 = val1 + val2 + o;
            st.push(t1);
        }
        System.out.println(st.peek());
    }
}
