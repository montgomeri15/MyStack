package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

import java.util.Optional;

public class MyStack implements Stackable {
    StackMessages stackMessages = new StackMessages();
    public int arrayStack[];
    public int top;
    public int size;

    public MyStack(int size) {
        this.size = size;
        arrayStack = new int[size];
        top = -1;
    }

    @Override
    public boolean isEmpty() { return (top == -1); }

    @Override
    public boolean isFull() { return top == size - 1; }

    @Override
    public void addElement(int element) throws FullStackException {
        try {
            arrayStack[++top] = element;
            System.out.println(stackMessages.additionMessage + element);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new FullStackException();
        }
    }

    @Override
    public void deleteElement() throws EmptyStackException {
        try{
            System.out.println(stackMessages.removalMessage + arrayStack[top]);
            arrayStack[top] = top--;
        } catch (ArrayIndexOutOfBoundsException e){
            throw new EmptyStackException();
        }
    }

    @Override
    public String topElement() throws EmptyStackException {
        try {
            return stackMessages.topElementMessage + arrayStack[top];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new EmptyStackException();
        }
    }

    @Override
    public Optional<Integer> getStackElement(int element) {
        Optional<Integer> opElement = Optional.of(arrayStack[element]);
        return opElement;
    }
}
