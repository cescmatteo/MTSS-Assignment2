////////////////////////////////////////////////////////////////////
// LUCA BRUGNERA 2014722
// MATTEO CESCON 2009984
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class Calculator {
    public int evaluate(String expression) {
    int sum = 0;
    for (String summand : expression.split("\\+")){
        sum += Integer.valueOf(summand);
    }
    return sum;
    }
  }