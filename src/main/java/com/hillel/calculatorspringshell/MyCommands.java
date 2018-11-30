package com.hillel.calculatorspringshell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MyCommands {

    private final ConsoleService console;
    private final CalculationService calculationService;
    private final ValueService value;

    @Autowired
    public MyCommands(ConsoleService console, CalculationService calculationService, ValueService value) {
        this.console = console;
        this.calculationService = calculationService;
        this.value = value;
    }

    @ShellMethod("Summing numbers")
    public void sum(String s){
        value.setValue(s);
        this.console.write("Numbers are summed %s ", s);
        calculationService.sum();

    }

    @ShellMethod("Minus numbers")
    public void minus(String s){
        value.setValue(s);
        this.console.write("These numbers got minused %s ", s);
        calculationService.minus();

    }

    @ShellMethod("Multiply numbers")
    public void multiply(String s){
        value.setValue(s);
        this.console.write("These numbers got multiplied %s ", s);
        calculationService.multiply();

    }

    @ShellMethod("Dividing numbers")
    public void divide(String s){
        value.setValue(s);
        this.console.write("These numbers got divided %s ", s);
        calculationService.divide();

    }

    @ShellMethod("Square")
    public void square(String s){
        value.setValue(s);
        this.console.write("Finding a square of %s ", s);
        calculationService.square();

    }

    @ShellMethod("SquareRoot")
    public void root(String s){
        value.setValue(s);
        this.console.write("Finding a square root of %s ", s);
        calculationService.squareRoot();

    }

    @ShellMethod("ReverseSign")
    public void reverse(String s){
        value.setValue(s);
        this.console.write("Reverse Sign of %s ", s);
        calculationService.reverseSign();
    }

}
