public class Exercise2 {

    public static void main(String[] args) {
        int[] arr1 = {14, 73, 21, 43, 34};
        int[] arr2 = {32, 37, 50, 51, 42, 12, 23};
        System.out.println(indexReturn(arr1, arr2));
    }

    public static int indexReturn(int[] arr1, int[] arr2){
        int index = 0;
        int number;
        int digit;
        int sumArr1 = 0;
        int sumArr2 = 0;
        for (int i = 0; i < arr2.length; i++){
            number = arr2[i];
            while (number > 0){
                digit = number % 10;
                sumArr2 = sumArr2 + digit;
                number = number / 10;
            }
            for (int j = 0; j < arr1.length; j++){
                number = arr1[j];
                while (number > 0){
                    digit = number % 10;
                    sumArr1 = sumArr1 + digit;
                    number = number / 10;
                }
            }
        }
        return index;
    }
}
