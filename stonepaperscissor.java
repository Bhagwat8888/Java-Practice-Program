import java.util.Scanner;

class stonepaperscissor {
    public static void main(String[] args) {
        int botResponse = 0;

        for(;;) {
            botResponse = (int)(Math.random() * 9);
            if(botResponse >= 1 && botResponse <= 3)
                break;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("   Welcome   ");
        System.out.println();
        System.out.println("1. Stone , 2. Paper , 3. Scissor");
        System.out.println("Choose one: ");
        int userChoice = sc.nextInt();

        String userResponse = "";  
        String botStringResponse = "";  

        switch(userChoice) {
            case 1:
                userResponse = "Stone";
                break;
            case 2:
                userResponse = "Paper";
                break;
            case 3:
                userResponse = "Scissor";
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        switch(botResponse) {
            case 1:
                botStringResponse = "Stone";
                break;
            case 2:
                botStringResponse = "Paper";
                break;
            case 3:
                botStringResponse = "Scissor";
                break;
        }

         System.out.println("   BOT     :    USER   ");
        System.out.println(botStringResponse + "      " + userResponse);

         if ((botStringResponse.equals("Stone") && userResponse.equals("Paper")) ||
            (botStringResponse.equals("Paper") && userResponse.equals("Scissor")) ||
            (botStringResponse.equals("Scissor") && userResponse.equals("Stone"))) {
            System.out.println("User wins the game ...!!!");
        } else if ((botStringResponse.equals("Stone") && userResponse.equals("Scissor")) ||
                   (botStringResponse.equals("Paper") && userResponse.equals("Stone")) ||
                   (botStringResponse.equals("Scissor") && userResponse.equals("Paper"))) {
            System.out.println("Bot wins the game ...!!!");
        } else {
            System.out.println("Match draw");
        }
    }
}
