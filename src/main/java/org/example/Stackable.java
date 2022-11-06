package org.example;

/**
 * У інтерфейсу Stackable мають бути такі методи
 *        - чи порожній стек?
 *        - Чи повний стек?
 *        - покласти елемент у стек
 *        - дістати елемент зі стека
 *        - Подивитися верхній елемент стека
 */

public interface Stackable {
    public boolean stackIsEmpty();
    public boolean stackIsFull();
    public void addElement(int element);
    public void deleteElement();
    public String topElement();
}
