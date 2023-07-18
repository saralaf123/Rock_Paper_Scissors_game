import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsgame {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("do you want to play with computer or with and another player? tap c if computer tap p if another player");
        String aloneOrOtherPlayer=scanner.next();
        Game game=new Game();
        if(aloneOrOtherPlayer.equals("c")){game.PaperRockplaygameWithComputer();}
        else if (aloneOrOtherPlayer.equals("p")){ game.PaperRockplaygame();}



    }
}
