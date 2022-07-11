package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Calculator Application");
        System.out.println("--------------------------------------------------------------------");
        ComputationUtil calculator = new ComputationUtil();

        while (true) {
            Integer userNum1 = null;
            Integer userNum2 = null;
            char selectedOp = 0;
            while (true) {
                System.out.println("Enter your first number: ");
                Scanner userInputA = new Scanner(System.in).useDelimiter("\\n");
                String firstNumber = userInputA.next();

                if (firstNumber.matches("[0-9]+")) {
                    userNum1 = Integer.parseInt(firstNumber);
                    break;
                } else {
                    System.out.println();
                    System.out.println("Silly, numbers only!");
                    System.out.println();
                }
            }

            while(true) {
                System.out.println("Enter your desired operation: (   +    -    /    *   ) ");
                Scanner userOperation = new Scanner(System.in).useDelimiter("\\n");
                String userOp = userOperation.next();

                if(userOp.matches("[+\\-/*]")){
                    selectedOp = userOp.charAt(0);
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Unavailable operation");
                    System.out.println();
                }
            }



            while (true) {
                System.out.println("Enter your second number: ");
                Scanner userInputB = new Scanner(System.in).useDelimiter("\\n");
                String secondNumber = userInputB.next();


                if (secondNumber.matches("[0-9]+")) {
                    userNum2 = Integer.parseInt(secondNumber);
                    break;
                } else {
                    System.out.println();
                    System.out.println("Silly, numbers only!");
                    System.out.println();
                }
            }

            Integer result = null;
            switch (selectedOp) {
                case '+':
                    result = calculator.additionUtil(userNum1, userNum2);
                    break;
                case '-':
                    result = calculator.subtractionUtil(userNum1, userNum2);
                    break;
                case '*':
                    result = calculator.multiplicationUtil(userNum1, userNum2);
                    break;
                case '/':
                    result = calculator.divisionUtil(userNum1, userNum2);
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println("--------------------------------------------------------------------");
            System.out.println("Result: "+result);
            System.out.println("--------------------------------------------------------------------");
        }
    }
}



class ComputationUtil
{
    public Integer additionUtil(Integer firstNumber, Integer secondNumber){
        return firstNumber + secondNumber;
    }
    public Integer subtractionUtil(Integer firstNumber, Integer secondNumber){
        return firstNumber - secondNumber;
    }
    public Integer multiplicationUtil(Integer firstNumber, Integer secondNumber){
        return firstNumber * secondNumber;
    }
    public Integer divisionUtil(Integer firstNumber, Integer secondNumber){
        return firstNumber / secondNumber;
    }

}
