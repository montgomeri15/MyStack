package org.example;

public class MyStack implements Stackable {
    StackMessages stackMessages = new StackMessages();
    private int arrayStack[];
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        arrayStack = new int[size];
        top = -1;
    }

    @Override
    public boolean stackIsEmpty() { return (top == -1); }

    @Override
    public boolean stackIsFull() { return top == size - 1; }

    @Override
    public void addElement(int element) {
        if (!stackIsFull()) {
            System.out.println(stackMessages.additionMessage + element);
            arrayStack[++top] = element;
        } else System.out.println(stackMessages.fullStackMessage);
    }

    @Override
    public void deleteElement() {
        if (!stackIsEmpty()) {
            System.out.println(stackMessages.removalMessage + arrayStack[top]);
            arrayStack[top] = top--;
        } else System.out.println(stackMessages.emptyStackMessage);
    }

    @Override
    public String topElement() {
        if (!stackIsEmpty()) return stackMessages.topElementMessage + arrayStack[top];
        else return stackMessages.emptyStackMessage;
    }
}
