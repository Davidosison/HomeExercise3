import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        decompositionIntoPrimeNumbers(number);
    }
    public static void decompositionIntoPrimeNumbers(int number){
        for (int i = 2; i < number; i++){
            while (number % i == 0){
                System.out.print(i + " ");
                number = number / i;
            }
        }
        if (number > 2){
            System.out.println(number);
        }
    }
}

