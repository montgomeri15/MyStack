package org.example;

public class StackMessages {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String emptyStackMessage = ANSI_RED + "Стек пустий!";
    public static final String fullStackMessage = ANSI_RED + "Стек переповнений!";
    public static final String additionMessage = ANSI_GREEN + "Елемент успішно додано:\t";
    public static final String removalMessage = ANSI_GREEN + "Елемент успішно видалено:\t";
    public static final String topElementMessage = ANSI_RESET + "Верхній елемент стеку:\t";
}
