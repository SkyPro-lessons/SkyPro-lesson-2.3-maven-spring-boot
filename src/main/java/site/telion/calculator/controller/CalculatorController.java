package site.telion.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.telion.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String helloMessage() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(defaultValue = "0") int num1,
                       @RequestParam(defaultValue = "0") int num2) {
        return calculatorService.printSolutionPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(defaultValue = "0") int num1,
                        @RequestParam(defaultValue = "0") int num2) {
        return calculatorService.printSolutionMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(defaultValue = "0") int num1,
                           @RequestParam(defaultValue = "0") int num2) {
        return calculatorService.printSolutionMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(defaultValue = "0") int num1,
                         @RequestParam(defaultValue = "0") int num2) {
        return calculatorService.printSolutionDivide(num1, num2);
    }


}


