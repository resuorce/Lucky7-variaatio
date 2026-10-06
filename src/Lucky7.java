import java.util.Random;
import java.util.Scanner;

public class Lucky7{
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        Scanner scanner = new Scanner (System.in);
        Scanner in = new Scanner (System.in);

        System.out.println("How much money do you want to play with?");
        int money = scanner.nextInt();
        scanner.nextLine();
        //Kysytään alkusumma, kunnes käyttäjä antaa positiivisen kokonaisluvun
        int money = 0;
        while (money <= 0)
        {
            System.out.println("How much money do you want to play with?");

            if (in.hasNextInt())
            {
                money = in.nextInt();
                if (money <= 0)
                {
                    System.out.println("The amount must be greater than 0.");
                }
            }
            else
            {
                System.out.println("Please enter a whole number.");
            }
            in.nextLine();
        }
     

        boolean playAgain = true;

        while (playAgain && money > 0)
        {
            money--;

            int number1 = random.nextInt(10) + 1;
            int number2 = random.nextInt(10) + 1;
            int number3 = random.nextInt(10) + 1;

            System.out.println(number1 + " " + number2 + " " + number3);

            if (number1 == 7 || number2 == 7 || number3 == 7)
            {
                System.out.println("You won 5 euros!");
                money += 5;
            }
            else
            {
                System.out.println("You lost!");
            }

            System.out.println("You have " + money + " euros left.");
            
            if (money > 0)
            {
                System.out.println("Would you like to play again? Press Enter to play again, or type anything else to exit.");
                
                String answer = scanner.nextLine();
                String answer = in.nextLine();

                if (!answer.isEmpty())
                {
                    playAgain = false;
                }
            }
        }
        
        System.out.println("Game over!");
    }
}
