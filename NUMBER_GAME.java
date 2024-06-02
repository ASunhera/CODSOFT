import java.util.Scanner;

public class NUMBER_GAME {
    public static void main(String[] args) {
        int round = 1;
        System.out.println("Lets Play Number Game 👍");
        System.out.println("You have three guesses 😁 and three Rounds");
        while(round<4){
            System.out.println("Round " + round + " Started");
            game();
            System.out.println("Round " + round + " Completed");
            round ++;
            if(round>3){
                System.out.println("Game over ✋");
            }
        }
    }

    public static void game(){
        int myNumber = (int)(Math.random()*100);
        int attempts = 0;
        int userNumber;
        int round = 1;
        Scanner sc = new Scanner(System.in);
        do{
            if (attempts<5){
                System.out.print("guess the Number : ");
                userNumber = sc.nextInt();
                if (userNumber==myNumber) {
                    System.out.println("whoowo you guess it right :)");
                    break;
                }
                else if (userNumber<myNumber) {
                    System.out.println("you entered a smaller number\n");
                    attempts++;
                }
                else{
                    System.out.println("you enter a large number\n");
                    attempts++;
                }
            }
            else {
                System.out.println("attempt limit exceeded 🚨");
                break;
            }
        }while(myNumber<100);
    }

}
