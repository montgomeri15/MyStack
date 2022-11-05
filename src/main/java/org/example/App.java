package org.example;

import java.util.Stack;

public class App {
    public static void main( String[] args ) {



        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Текущий стек: " + stack);
    }
}
