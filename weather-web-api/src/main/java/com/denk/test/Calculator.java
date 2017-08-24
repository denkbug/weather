package com.denk.test;

/**
 * Created by lvdengke1 on 2017/8/23.
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum -= Integer.valueOf(summand);
        return sum;
    }
}
