import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str = userInput.nextLine();

        System.out.println(replaceMostFreqAndSecondMostFreq(str));
    }

    public static char findMostFreq(String str){
     char mostFrequent = 0;
     int counter;
     str = str.toLowerCase();
     char[] c = str.toCharArray();
     for (int i = 0; i < str.length(); i++){
         counter = 0;
         for (int j = 0; j < str.length(); j++){
             if (j < i && c[i] == c[j]){
                 break;
             }
             if (c[j] == c[i]){
                 counter++;
             }
         }
         mostFrequent = c[i];
     }
     return mostFrequent;
    }

    public static char findSecondMostFreq(String str){
        char secondFrequent = 0;
        int counter;
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            secondFrequent = 0;
            counter = 0;
            for (int j = 0; j < str.length(); j++){
                if (j < i && c[i] == c[j]){
                    break;
                }
                if (c[j] == c[i]){
                    counter++;
                }
            }
            if (secondFrequent == c[i]){
                secondFrequent = c[i];
            }
        }
        return secondFrequent;
    }

    public static String replaceMostFreqAndSecondMostFreq(String str){
        char mostFreq = findMostFreq(str);
        char secondMostFreq = findSecondMostFreq(str);
        String newStr = str.replace(mostFreq, secondMostFreq);
        return newStr;
    }
}
