import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number");
            number = scanner.nextInt();
        }while (number < 0);
        System.out.println(changingNumberCheck(number) );

        int[] arr = {123, 252, 3456, 4561, 1232};
        System.out.println(indexOfTheNumberWithSmallestSum(arr));
    }

    public static boolean changingNumberCheck(int number) {
        boolean changingNumberCheck = true;
        while (number % 10 != 0){
            if (number % 10 % 2 == 0){
                number = number / 10;
                if (number % 10 % 2 == 0){
                    changingNumberCheck = false;
                    break;
                }
            }else if (number % 10 % 2 != 0){
                    number = number / 10;
                    if (number % 10 % 2 != 0){
                        changingNumberCheck = false;
                        break;
                    }
                }
            }
        return changingNumberCheck;
    }

    public static  int sumOfNumber (int num){
        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static int indexOfTheNumberWithSmallestSum(int[] arr){
        int index = -1;
        int min = -1;

        for (int i = 0; i < arr.length; i++){
            int number = arr[i];
            if (changingNumberCheck(number) && min == -1){
            min = sumOfNumber(number);
            index = i;

            }else if(changingNumberCheck(number)) {
                number = sumOfNumber(number);
                if (number < min) {
                    min = number;
                    index = i;
                }
            }
        }
        return index;
    }
}

