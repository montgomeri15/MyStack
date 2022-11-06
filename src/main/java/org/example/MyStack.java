package org.example;

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
    public void addElement(int element) {
        if (!isFull()) {
            System.out.println(stackMessages.additionMessage + element);
            arrayStack[++top] = element;
        } else System.out.println(stackMessages.fullStackMessage);
    }

    @Override
    public void deleteElement() {
        if (!isEmpty()) {
            System.out.println(stackMessages.removalMessage + arrayStack[top]);
            arrayStack[top] = top--;
        } else System.out.println(stackMessages.emptyStackMessage);
    }

    @Override
    public String topElement() {
        if (!isEmpty()) return stackMessages.topElementMessage + arrayStack[top];
        else return stackMessages.emptyStackMessage;
    }
}
