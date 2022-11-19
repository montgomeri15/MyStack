package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExceptionsTest {
    @Test
    void testEmptyStackException() {
        MyStack myStack = new MyStack(10);

        EmptyStackException thrown = assertThrows(
                EmptyStackException.class, () -> myStack.topElement(),
                "Expected myStack.topElement() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Stack is empty!"));
    }

    @Test
    void testFullStackException() {
        MyStack myStack = new MyStack(0);

        FullStackException thrown = assertThrows(
                FullStackException.class, () -> myStack.addElement(7),
                "Expected myStack.addElement(7) to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Stack is full!"));
    }
}
