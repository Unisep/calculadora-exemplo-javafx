package com.luizcarraro.calculadora.model;

public class Calculation {

    public long calculate(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0;

                return number1 / number2;
        }

        System.out.println("Operador inválido - " + operator);
        return 0;
    }
}
