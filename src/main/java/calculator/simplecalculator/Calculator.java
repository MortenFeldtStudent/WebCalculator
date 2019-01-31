/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.simplecalculator;

/**
 *
 * @author nr
 */
public class Calculator implements ICalculator{

    @Override
    public int add(int n1, int n2) {
        int result = n1+n2;
        System.out.println("Result of: " + n1 + "+" + n2 + " = " + result);
        return result;
    }

    @Override
    public int sub(int n1, int n2) {
        int result = n1-n2;
        System.out.println("Result of: " + n1 + "-" + n2 + " = " + result);
        return result;
    }

    @Override
    public int mul(int n1, int n2) {
        int result = n1*n2;
        System.out.println("Result of: " + n1 + "*" + n2 + " = " + result);
        return result;
    }

    @Override
    public int div(int n1, int n2) throws ArithmeticException {
        int result = n1/n2;
        System.out.println("Result of: " + n1 + "/" + n2 + " = " + result);
        return result;
    }
    
}
