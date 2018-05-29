package com.tiantao.learn.algorithm.stack;

import java.util.Stack;

/**
 * 要求：设计一个栈，除了标准的栈操作，需要一个getMin() 返回当前栈中最新的值
 *
 * 实现思路：两个栈 一个是正常保存数据，另一个保存当前栈的最新值，压入时判断，当压入值小于等于最新值栈的最外一个数时，压人最新值栈
 * 弹出时判断，当弹出值与最新值栈的peek数相等时，同步弹出。
 *
 * 另外一种思路是压栈时，比较当前值和最新值栈的peek，总是压入两个值中较小的。弹出时 同步弹出。
 * Created by tiantao on 2018/5/17.
 */
public class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;


    public MinStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(Integer integer) {
        if (stackMin.isEmpty()) {
            stackMin.push(integer);
        } else {
            if (stackMin.peek() >= integer) {
                stackMin.push(integer);
            }
        }
        stackData.push(integer);
    }

    public Integer pop() {

        if (stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty!");
        }


        if (stackData.peek().equals(stackMin.peek())) {
            stackMin.pop();
        }

        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty!");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(14);
        minStack.push(13);
        minStack.push(14);
        minStack.push(1);
        minStack.push(3);
        minStack.push(5);
        minStack.push(100);

        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.getMin());
    }

}
