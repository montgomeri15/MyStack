package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

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
        //myStack.addElement(111);
        //myStack.addElement(121);

        System.out.println(myStack.topElement());

        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();
        myStack.deleteElement();

        System.out.println(myStack.topElement());
    }
}
