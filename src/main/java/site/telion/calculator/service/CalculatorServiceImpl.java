package site.telion.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String printSolutionPlus(Double a, Double b) {
        checkNum(a, b);
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String printSolutionMinus(Double a, Double b) {
        checkNum(a, b);
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String printSolutionMultiply(Double a, Double b) {
        checkNum(a, b);
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String printSolutionDivide(Double a, Double b) {
        checkNum(a, b);
        try {
            return a + " / " + b + " = " + Math.round(a / b * 1.0);
        } catch (ArithmeticException e) {
            return a + " / " + b + " = 0";
        }
    }

    private void checkNum(Double a, Double b) {
        if (a == null) {
            throw new RuntimeException("Не передан параметр num1");
        }

        if (b == null) {
            throw new RuntimeException("Не передан параметр num2");
        }
    }
}
