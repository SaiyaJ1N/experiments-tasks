package main;
import java.util.Scanner;


public class GuessTheWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testWord = "BjornCock";
        System.out.println("Вгадай слово по буквам, воно складається з - " + testWord.length() + " символів.");
        int attemptCounter = 1;
        String attemptWord = "";

        for (int i = 5; i > 0; i--) {
            System.out.println("В тебе залишилось - " + i + " спроб.");
            System.out.print("Ваше зібране слов - " + attemptWord + "\n" + "Спроба: " + attemptCounter++ + ": ");
            String inputAnswer = in.next();
            attemptWord = "";

            for(int j = 0; j < inputAnswer.length(); j++){
                if(inputAnswer.charAt(j) == testWord.charAt(j) || Character.toUpperCase(inputAnswer.charAt(j)) == testWord.charAt(j)){
                    attemptWord += testWord.charAt(j);
                } else {
                    break;
                }
            }

            if(attemptWord.equals(testWord)){
                System.out.println("Правильно ви вгадали слово: " + testWord + "!!!");
                break;
            }

            if (i == 1){
                System.out.println("Нажаль ти не вгадав, правильне слово: " + testWord);
            }

            if (inputAnswer.equals("exit")) {
                System.out.println("Ви сдались(");
                break;
                }
            }
        }
    }



