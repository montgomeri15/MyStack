package org.example;

public interface Stackable {
    public boolean isEmpty();
    public boolean isFull();
    public void addElement(int element);
    public void deleteElement();
    public String topElement();
}
