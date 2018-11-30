package com.hillel.calculatorspringshell;

import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class ConsoleService {
    private static final String ANSI_YELLOW = "\u001B[33m";
    private final static String ANSI_RESET = "\u001B[0m";
    private static final String RED = "\033[0;31m";


    private final PrintStream out = System.out;

    public void write(String msg, String ... args){
        this.out.print(RED);
        this.out.print("$$$ ");
        this.out.print(ANSI_YELLOW);
        this.out.printf(msg, (Object[]) args);
        this.out.print(ANSI_RESET);
        this.out.println();
    }
}
