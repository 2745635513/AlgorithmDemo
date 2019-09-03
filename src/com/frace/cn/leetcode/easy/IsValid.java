package com.frace.cn.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

//        HashMap<Character,Character> maps=new HashMap<Character,Character>();
//        maps.put(')','(');
//        maps.put(']','[');
//        maps.put('}','{');
//        Stack<Character> stack=new Stack<Character>();
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if(maps.containsKey(c)){
//                if(stack.empty()||stack.pop()!=maps.get(c))return false;
//            }
//            else
//                stack.push(c);
//        }
//        return stack.empty();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.empty() ||stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("(()("));
    }
}
