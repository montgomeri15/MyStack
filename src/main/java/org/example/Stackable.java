package org.example;

import custom.exceptions.EmptyStackException;
import custom.exceptions.FullStackException;

import java.util.Optional;

public interface Stackable {
    boolean isEmpty();
    boolean isFull();
    void addElement(int element) throws FullStackException;
    void deleteElement() throws EmptyStackException;
    String topElement() throws EmptyStackException;
    Optional<Integer> getStackElement(int element);
}
