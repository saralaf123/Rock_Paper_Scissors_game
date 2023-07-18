import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;

     public Game(Player player1,Player player2)
     {
         this.player1=player1;
         this.player2=player2;
     }
     public Game()
     {
         player1 = new Player();
         player2 = new Player();
     }

     public String computerChoice()
    {
        int number = (int) (Math.random() * 3);

        if (number == 0) {
            return "Rock";
        } else if (number == 1) {
            return "Paper";
        } else {
            return "Scissor";
        }
    }

    public void PaperRockplaygameWithComputer( )
    {

        Scanner scanner=new Scanner(System.in) ;
            System.out.println("welcome to  rock, paper, scissors\"");
            System.out.println("Please enter the first player name:");
            player1.setName(scanner.next());

            player2.setName("Computer");
            int winner1=0;
            int winner2=0;
            boolean playgame=true;
            while(playgame) {


                System.out.println("can the first player choose rock or paper or scissors");
                String choice1=player1.Setchoice(scanner.next());
                System.out.println("can the second player choose rock or paper or scissors");
                String choice2=computerChoice();
                System.out.println(player1.getName()+" choose "+ choice1);
                System.out.println(player2.getName()+" choose "+ choice2);
                if (choice1.equals(choice2)) {

                    System.out.println("no winner");
                }else if (choice1.equals("Rock")&& choice2.equals("Paper"))
                {
                    System.out.println(player2.getName()+" is the winner");
                    winner2++;

                }else if (choice1.equals("Paper")&& choice2.equals("Rock"))
                {
                    System.out.println(player1.getName()+" is the winner");
                    winner1++;
                }else if (choice1.equals("Scissor")&& choice2.equals("Rock"))
                {
                    System.out.println(player2.getName()+" is the winner");
                winner2++;
                }
                else if (choice1.equals("Rock")&& choice2.equals("Scissor"))
                {
                    System.out.println(player1.getName()+" is the winner");
                    winner1++;
                }else if (choice1.equals("Scissor")&& choice2.equals("Paper"))
                {
                    System.out.println(player1.getName()+" is the winner");
                    winner1++;
                } else if (choice2.equals("Scissor")&& choice1.equals("Paper"))
                {
                    System.out.println(""+player2.getName()+" is the winner");
                    winner2++;
                }
                else
                {
                    System.out.println("Invalid");
                }
                System.out.println("do you want to play the game again? yes /no");
                String answer=scanner.next();
                if (answer.equals("no"))
                {
                    playgame=false;
                }
            }

            System.out.println("player1 :"+winner1+" player2 :"+winner2+"");


    }


    public void PaperRockplaygame()
    {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("welcome to  rock, paper, scissors");


        System.out.println("Please enter your name player 1:");

        player1.setName(scanner.next());
        System.out.println("Please enter your name player 2:");
        player2.setName(scanner.next());
        int winner1=0;
        int winner2=0;
        boolean playgame=true;
            while(playgame) {


                    System.out.println("can the first player choose Rock or Paper or Scissor");
                    String choice1=player1.Setchoice(scanner.next());
                    System.out.println("can the second player choose Rock or Paper or Scissor");
                    String choice2=player2.Setchoice(scanner.next());
                    System.out.println(player1.getName()+" choose "+ choice1);
                    System.out.println(player2.getName()+" choose "+ choice2);
                    if (choice1.equals(choice2)) {

                        System.out.println("no winner");
                    }else if (choice1.equals("Rock")&& choice2.equals("Paper"))
                    {
                        System.out.println(player2.getName()+" is the winner");
                        winner2++;

                    }else if (choice1.equals("Paper")&& choice2.equals("Rock"))
                    {
                        System.out.println(player1.getName()+" is the winner");
                        winner1++;

                    }else if (choice1.equals("Scissor")&& choice2.equals("Rock"))
                    {
                        System.out.println(player2.getName()+" is the winner");
                        winner2++;
                    }
                    else if (choice1.equals("Rock")&& choice2.equals("Scissor"))
                    {
                        System.out.println(player1.getName()+" is the winner");
                        winner1++;
                    }else if (choice1.equals("Scissor")&& choice2.equals("Paper"))
                    {
                        System.out.println(player1.getName()+" is the winner");
                        winner1++;
                    } else if (choice2.equals("Scissor")&& choice1.equals("Paper"))
                    {
                        System.out.println(player2.getName()+" is the winner");
                        winner2++;
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                    System.out.println("do you want to play the game again? yes /no");
                    String answer=scanner.next();
                    if (answer.equals("no"))
                    {
                        playgame=false;
                    }
            }

        System.out.println("player1 :"+winner1+" player2 :"+winner2+"|");

    }
}
