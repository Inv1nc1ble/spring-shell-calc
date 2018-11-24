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
}
