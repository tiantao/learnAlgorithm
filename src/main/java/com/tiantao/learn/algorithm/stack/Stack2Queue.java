package com.tiantao.learn.algorithm.stack;

import java.util.Collection;
import java.util.Stack;

/**
 * 要求：利用两个栈实现一个队列功能，支持标准的队列操作 add peek poll
 * Created by tiantao on 2018/5/17.
 */
public class Stack2Queue{

    private int size;

    private Stack<String> stackPush;
    private Stack<String> stackPop;


    public Stack2Queue() {
        this.size = 0;
        this.stackPop = new Stack<String>();
        this.stackPush = new Stack<String>();
    }


    /**
     * Returns the number of elements in this collection.  If this collection
     * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this collection
     */
    public int size() {
        return size;
    }

    /**
     * Returns <tt>true</tt> if this collection contains no elements.
     *
     * @return <tt>true</tt> if this collection contains no elements
     */
    public boolean isEmpty() {
        return  size > 0;
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions, returning
     * {@code true} upon success and throwing an {@code IllegalStateException}
     * if no space is currently available.
     *
     * @param s the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws IllegalStateException    if the element cannot be added at this
     *                                  time due to capacity restrictions
     * @throws ClassCastException       if the class of the specified element
     *                                  prevents it from being added to this queue
     * @throws NullPointerException     if the specified element is null and
     *                                  this queue does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *                                  prevents it from being added to this queue
     */
    public boolean add(String s) {
        size ++;
        stackPush.push(s);
        return true;
    }

    /**
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public String peek() {
        if (!stackPop.empty()){
            return stackPop.peek();
        } else {
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        if (stackPop.empty()){
            return null;
        }else {
            return stackPop.peek();
        }
    }

    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public String poll() {
        if (!stackPop.empty()){
            size --;
            return stackPop.pop();
        } else {
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        if (stackPop.empty()){
            return null;
        }else {
            size --;
            return stackPop.pop();
        }
    }

    public static void main(String[] args) {
        Stack2Queue stack2Queue = new Stack2Queue();
        stack2Queue.add("1");
        stack2Queue.add("2");
        stack2Queue.add("3");
        stack2Queue.add("4");
        stack2Queue.add("5");

        System.out.println(stack2Queue.peek());
        System.out.println(stack2Queue.poll());
        System.out.println(stack2Queue.peek());
        System.out.println(stack2Queue.poll());
        System.out.println(stack2Queue.peek());
        System.out.println(stack2Queue.poll());
        System.out.println(stack2Queue.peek());
        System.out.println(stack2Queue.poll());
        System.out.println(stack2Queue.peek());
        System.out.println(stack2Queue.poll());
    }

}
