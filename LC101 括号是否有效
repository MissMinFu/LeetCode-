package com.nowcoder.community.lc;

import java.util.Stack;

public class LC101 {

    public  static   boolean isValid(String s) {

        Stack<Character> stack1=new Stack<Character>();
        int len=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<len;i++){
            if(ch[i]=='{'){
                stack1.push('}');
            }else if(ch[i]=='[') {
                stack1.push(']');
            }else if(ch[i]=='(') {
                stack1.push(')');
            }else if(stack1.isEmpty()||stack1.pop()!=ch[i]){
                    return  false;
            }
        }
        return stack1.isEmpty();

    }

    public static void main(String[] args) {
        isValid("{}");
    }
}
