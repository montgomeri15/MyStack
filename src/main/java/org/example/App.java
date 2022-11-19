package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

import java.util.Optional;

public class App {
    public static void main( String[] args ) throws EmptyStackException, FullStackException {
        MyStack myStack = new MyStack(10);

        myStack.addElement(11);
        myStack.addElement(21);
        myStack.addElement(31);
        myStack.addElement(41);
        myStack.addElement(51);
        myStack.addElement(61);
        myStack.addElement(71);
        myStack.addElement(81);
        myStack.addElement(91);
        myStack.addElement(101);

        System.out.println(myStack.topElement());

        //The problem is, that we can get only ArrayIndexOutOfBoundsException,
        //so Optional is completely irrelevant to an element fetch task ¯\_(ツ)_/¯
        System.out.println(myStack.getStackElement(5).get());
    }
}