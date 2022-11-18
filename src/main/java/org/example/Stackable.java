package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

public interface Stackable {
    boolean isEmpty();
    boolean isFull();
    void addElement(int element) throws FullStackException;
    void deleteElement() throws EmptyStackException;
    String topElement() throws EmptyStackException;
}
