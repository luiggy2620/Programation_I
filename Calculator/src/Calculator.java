import java.util.Scanner;

public class Calculator {

    static Scanner sn = new Scanner(System.in);
    static boolean menuStatus = true;

    public void printMenu(){
        System.out.println("------------- Calculator -------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public void chooseOperation(){

        System.out.print("Select operation: ");
        int option = sn.nextInt();

        switch (option){
            case 1:
                showOperationHeader("Addition");
                addition(getNumber(), getNumber());
                break;
            case 2:
                showOperationHeader("Subtraction");
                subtraction(getNumber(), getNumber());
                break;
            case 3:
                showOperationHeader("Multiplication");
                multiplication(getNumber(), getNumber());
                break;
            case 4:
                showOperationHeader("Division");
                division(getNumber(), getNumber());
                break;
            case 5:
                menuStatus = false;
                System.out.print("------------- Calculator Closed -------------");
                break;
            default:
                System.out.println("Wrong option");
        }

    }

    void showOperationHeader(String operationName){
        System.out.println("-------------"+ operationName + " option selected-------------");
        System.out.println("-------------Please insert two numbers---------------");
    }

    double getNumber(){
        System.out.print(">> ");
        return sn.nextDouble();
    }


    // Operations
    public double addition(double numberOne, double numberTwo){
        double result = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + result);
        return result;
    }

    public double subtraction(double numberOne, double numberTwo){
        double result = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + result);
        return result;
    }

    public double multiplication(double numberOne, double numberTwo) {
        double result = numberOne * numberTwo;
        System.out.println(numberOne + " * " + numberTwo + " = " + result);
        return result;

    }

    public double division(double numberOne, double numberTwo){
        double result = numberOne / numberTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + result);
        return result;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while (menuStatus){
            calculator.printMenu();
            calculator.chooseOperation();
        }
    }

}
