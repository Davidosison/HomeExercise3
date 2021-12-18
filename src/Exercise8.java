import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(strInput());
    }

    public static String[] strInput(){
        Scanner scanner = new Scanner(System.in);
        String word = " ";
        String[] words = new String[0];
        
        do {
            for (int i = 0; i == i; i++) {
            System.out.println("Enter your word: ");
            words[i] = scanner.nextLine();
            }
        }while (word.length() >= 4);

        return words;
    }


}
