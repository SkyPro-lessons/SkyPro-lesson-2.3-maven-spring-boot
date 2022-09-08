package site.telion.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String printSolutionPlus(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String printSolutionMinus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String printSolutionMultiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String printSolutionDivide(int a, int b) {
        try {
            return a + " / " + b + " = " + Math.round((double) a / b);
        } catch (ArithmeticException e) {
            return a + " / " + b + " = 0";
        }
    }
}
