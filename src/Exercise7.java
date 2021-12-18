
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the quadratic equation " +
                "\nof the next form : ax^2+bx+c=0");
        String quadraticEquation = scanner.nextLine();
        char a = quadraticEquation.charAt(0);
        char b = quadraticEquation.charAt(5);
        char c = quadraticEquation.charAt(8);

        int aNum = a - '0';
        int bNum = b - '0';
        int cNum = c - '0';

        if (a == '-'){
            aNum = -1;
        }

        if (b == '-'){
            bNum = -1;
        }

        if (c == '-'){
            cNum = -1;
        }
        quadraticEquationCalculation(aNum, bNum, cNum);
    }

    public static void quadraticEquationCalculation(int a, int b, int c) {

        if (a == 0) {
            System.out.println("There is no solution for the equation.");

        } else if ((Math.pow(b, 2) - 4 * a * c) < 0) {
            System.out.println("There is no solution for the equation.");

        } else if (rootFormula(a, b, c) == 0) {
            System.out.println("There is one solution for the equation: " + (-b / 2 * a));

        } else if (rootFormula(a, b, c) > 0) {
            System.out.println("The first solutions is: " + "x1 = "
                    + ((-b - (rootFormula(a, b, c))) / 2 * a));
            System.out.println("The second solution is: " + "x2 = "
                    + ((-b + (rootFormula(a, b, c))) / 2 * a));
        }
    }

    public static double rootFormula(int a, int b, int c) {
        return Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    }
}
