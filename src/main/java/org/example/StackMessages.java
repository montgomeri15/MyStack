package org.example;

public class StackMessages {
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String emptyStackMessage = ANSI_RED + "Стек пустий!";
    static final String fullStackMessage = ANSI_RED + "Стек переповнений!";
    static final String additionMessage = ANSI_GREEN + "Елемент успішно додано:\t";
    static final String removalMessage = ANSI_GREEN + "Елемент успішно видалено:\t";
    static final String topElementMessage = ANSI_RESET + "Верхній елемент стеку:\t";
}
