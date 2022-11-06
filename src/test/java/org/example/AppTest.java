package org.example;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void stackIsCreatedTest(){
        MyStack myStack = new MyStack(10);

        assertThat(myStack.size).isEqualTo(10);
        assertThat(myStack.arrayStack.length).isEqualTo(10);
        assertThat(myStack.top).isEqualTo(-1);
    }

    @Test
    public void stackIsEmptyTest(){
        MyStack myStack = new MyStack(10);

        assertThat(myStack.isEmpty()).isTrue();
    }

    @Test
    public void stackIsFullTest(){
        MyStack myStack = new MyStack(2);

        myStack.addElement(3);
        myStack.addElement(5);

        assertThat(myStack.isFull()).isTrue();
    }

    @Test
    public void elementIsAdded(){
        MyStack myStack = new MyStack(2);

        myStack.addElement(3);
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(3);

        myStack.addElement(5);
        assertThat(myStack.arrayStack[myStack.top]).isEqualTo(5);
    }

    @Test
    public void elementIsDeleted(){
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
    public void topElementIsEmpty(){
        MyStack myStack = new MyStack(10);
        StackMessages stackMessages = new StackMessages();
        String ANSI_RED = "\u001B[31m";

        assertThat(myStack.topElement()).isEqualTo(stackMessages.emptyStackMessage);
        assertThat(myStack.topElement()).isEqualTo(ANSI_RED + "Стек пустий!");
    }

    @Test
    public void topElementExists(){
        MyStack myStack = new MyStack(10);
        StackMessages stackMessages = new StackMessages();
        String ANSI_RESET = "\u001B[0m";

        myStack.addElement(3);
        myStack.addElement(5);

        assertThat(myStack.topElement()).isEqualTo(stackMessages.topElementMessage + 5);
        assertThat(myStack.topElement()).isEqualTo(ANSI_RESET + "Верхній елемент стеку:\t" + 5);
    }
}
