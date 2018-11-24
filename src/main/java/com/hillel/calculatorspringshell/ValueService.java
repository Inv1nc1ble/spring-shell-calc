package com.hillel.calculatorspringshell;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ValueService {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public List<Double> giveTheList(){
        String[] arr = value.split(" ");
        Double[] arrDl = new Double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrDl[i] = Double.parseDouble(arr[i]);
        }
        return new ArrayList<>(Arrays.asList(arrDl));
    }
}
