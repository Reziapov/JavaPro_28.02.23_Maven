package com.hillel.reziapov.homeworks.homework14;


public class Main {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Enter: Calculator <number1> <number2> <operator>");
            return;
        }

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        String operator = args[2];
        double result;

            switch (operator) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "x" -> result = number1 * number2;
                case "/" -> {
                    if (number2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        return;
                    }
                    result = number1 / number2;
                }
                default -> {
                    System.out.println("Incorrect operator! Please restart ");
                    return;
                }
            }
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);


        }

    }


