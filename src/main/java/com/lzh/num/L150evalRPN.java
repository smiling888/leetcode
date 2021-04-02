package com.lzh.num;

import java.util.Stack;

/******************************************************
 * @Date: 2021-03-11
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L150evalRPN {
    public int evalRPN(String[] tokens) {
        StringBuilder stringBuilder=new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {

            switch (token) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(a+b);
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.add(a/b);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.add(a*b);
                    break;
                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.add(a-b);
                    break;
                default:
                    stack.add(Integer.valueOf(token));
            }

        }
        return stack.pop();

    }

    public static void main(String[] args) {
        new L150evalRPN().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    }
}
