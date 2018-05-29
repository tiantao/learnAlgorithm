package com.tiantao.learn.algorithm.stack;

import java.util.Stack;

/**
 * Created by tiantao on 2018/5/17.
 */
public class RecursionReverseOrder {

    private Stack<String> stack;
    private Stack<String> reverseOrderStack;

    public RecursionReverseOrder() {
        this.stack = new Stack<String>();
        this.reverseOrderStack = new Stack<String>();
    }

    public void reverse(){
        this.recursion(stack);
    }

    public String pop(){
        return reverseOrderStack.pop();
    }

    public void push(String s){
        stack.push(s);
    }

    private Stack<String> recursion(Stack<String> stack){
        if (!stack.isEmpty()){
            String temp = stack.pop();
            reverseOrderStack.push(temp);
            if (stack.empty()){
                return  stack;
            }else {
                recursion(stack);
                return stack;
            }

        }
        return stack;
    }

    public static void main(String[] args) {
        RecursionReverseOrder reverseOrder = new RecursionReverseOrder();
        reverseOrder.push("1");
        reverseOrder.push("2");
        reverseOrder.push("3");
        reverseOrder.push("4");
        reverseOrder.push("5");
        reverseOrder.push("6");

        reverseOrder.reverse();

        System.out.println(reverseOrder.pop());
        System.out.println(reverseOrder.pop());
        System.out.println(reverseOrder.pop());
        System.out.println(reverseOrder.pop());
        System.out.println(reverseOrder.pop());
        System.out.println(reverseOrder.pop());
    }


}
