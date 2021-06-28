package HiLo;

import java.util.Scanner;



public class HiLo {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfTries = 0;
        String playAgain;
        do {

            int theNunber = (int) (Math.random() * 100 + 1);
            //        System.out.println(theNunber);
            int guess = 0;
            while (guess != theNunber) {
                System.out.println("Введите число от 1 до 100");
                guess = scan.nextInt();
                numberOfTries = numberOfTries + 1;
                if (guess < theNunber)
                    System.out.println(guess + " Очень маленькое число. Попробуйте еще раз!");
                else if (guess > theNunber)
                    System.out.println(guess + " Очень большое число. Попробуйте еще раз!");
                else
                    System.out.println(guess + " Верно. !!!You win!!!");
            }

            System.out.println("Хотели бы вы попробовать снова? (y/n)");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Спасибо, что играли в эту игру!" + "Вам потребовалось " + numberOfTries + " Ходов.До Свидания!");
        scan.close();
    }
}



