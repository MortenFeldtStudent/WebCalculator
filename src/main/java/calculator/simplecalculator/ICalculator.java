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
public interface ICalculator {
    
  int add(int n1, int n2);
  int sub(int n1, int n2);
  int mul(int n1, int n2);
  int div(int n1, int n2) throws ArithmeticException;
    
}
