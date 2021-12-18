
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {15, 19, 17, 16, 18, 14};
        System.out.println(fullArrayCheck(arr));
    }

    public static boolean fullArrayCheck(int[] arr) {
        boolean fullArrayCheck = false;
        int min = getMin(arr);
        int max = getMax(arr);
        int count = 1;
        int size = max - min + 1;

        if (max != arr[0] && min == arr[arr.length - 1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != max - 1) {
                    count++;
                    max = max - 1;
                } else {
                    break;
                }
            }
            if (count == size && size == arr.length){
                fullArrayCheck = true;
            }
        }
        return fullArrayCheck;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}





