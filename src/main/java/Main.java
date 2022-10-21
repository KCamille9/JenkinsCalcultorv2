import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();

    System.out.println("Welcome to the calculator! \n Enter a command: \n");

    Scanner sc =  new Scanner(System.in);
    String line = sc.nextLine();

    String [] commands= line.split(" ");

    switch (commands[0]) {
      case "add":
        System.out.println(myCalculator.add(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
        break;
      case "subtract":
        System.out.println(myCalculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
        break;
      case "multiply":
        System.out.println(myCalculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
        break;
      case "divide":
        System.out.println(myCalculator.divide(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
        break;
      case "fibonacci":
        System.out.println(myCalculator.fibonacciNumberFinder(Integer.parseInt(commands[1])));
        break;
      case "binary":
        System.out.println(myCalculator.intToBinaryNumber(Integer.parseInt(commands[1])));
        break;
    }

    System.out.println();

  }
}
