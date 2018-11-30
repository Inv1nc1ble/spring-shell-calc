package com.hillel.calculatorspringshell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {

    private ValueService service;

    @Autowired
    public void setService(ValueService service) {
        this.service = service;
    }

    public void sum(){
        List<Double> list = service.giveTheList();
        double result = 0;
        for (double x : list){
            result += x;
        }
        System.out.println(result);
    }


    public void divide() {
        List<Double> list = service.giveTheList();
        double result = list.get(0);
        list.remove(0);
        for (double x : list){
            result /= x;
        }
        System.out.println(result);
    }

    public void minus() {
        List<Double> list = service.giveTheList();
        double result = list.get(0);
        list.remove(0);
        for (double x : list){
            result -= x;
        }
        System.out.println(result);
    }

    public void multiply() {
        List<Double> list = service.giveTheList();
        double result = 1;
        for (double x : list){
            result *= x;
        }
        System.out.println(result);
    }


    public void square() {
        List<Double> list = service.giveTheList();
        if (list.size() > 1 ) {
            System.out.println("Please enter 1 number for Square Function");
        }
        else {
            System.out.println(Math.pow(list.get(0), 2));
        }
    }

    public void squareRoot(){
        List<Double> list = service.giveTheList();
        if (list.size() > 1 ) {
            System.out.println("Please enter 1 number for Square Root Function");
        }
        else {
            System.out.println(Math.sqrt(list.get(0)));
        }
    }

    public void reverseSign() {
        List<Double> list = service.giveTheList();
        if (list.size() > 1 ) {
            System.out.println("Please enter 1 number for Square Root Function");
        }
        else {
            System.out.println(list.get(0) * -1);
        }
    }
}
