package org.example;
import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {
    @Test
    void stackIsCreatedTest(){
        MyStack myStack = new MyStack(10);

        assertThat(myStack.size).isEqualTo(10);
        assertThat(myStack.arrayStack.length).isEqualTo(10);
        assertThat(myStack.top).isEqualTo(-1);
    }

    @Test
    void stackIsEmptyTest(){
        MyStack myStack = new MyStack(10);

        assertThat(myStack.isEmpty()).isTrue();
    }

    @Test
    void stackIsFullTest() throws FullStackException {
        MyStack myStack = new MyStack(2);

        myStack.addElement(3);
        myStack.addElement(5);

        assertThat(myStack.isFull()).isTrue();
    }

    @Test
    void elementIsAdded() throws FullStackException {
        MyStack myStack = new MyStack(2);

        myStack.addElement(3);
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(3);

        myStack.addElement(5);
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(5);
    }

    @Test
    void elementIsDeleted() throws EmptyStackException, FullStackException {
        MyStack myStack = new MyStack(5);

        myStack.addElement(3);
        myStack.addElement(5);
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(5);

        myStack.deleteElement();
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(3);

        myStack.deleteElement();
        assertThat(myStack.top).isEqualTo(-1);
    }

    @Test
    void topElementExists() throws EmptyStackException, FullStackException {
        MyStack myStack = new MyStack(10);
        StackMessages stackMessages = new StackMessages();

        myStack.addElement(3);
        myStack.addElement(5);

        assertThat(myStack.topElement()).isEqualTo(stackMessages.topElementMessage + 5);
    }

    @Test
    void getCorrectStackElement() throws FullStackException {
        MyStack myStack = new MyStack(10);

        myStack.addElement(3);
        myStack.addElement(5);
        int testStackElement = myStack.getStackElement(1).get();

        assertThat(testStackElement).isEqualTo(5);
    }

    @Test
    public void getIncorrectStackElement() {
        MyStack myStack = new MyStack(10);

        assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{
                    myStack.getStackElement(-1);
                });
    }
}
