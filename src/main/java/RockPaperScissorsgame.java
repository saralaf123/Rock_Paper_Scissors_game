import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsgame {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("do you want to play alone or with and another player? tap a if alone tap p if with other players");
        String aloneOrOtherPlayer=scanner.next();
        Game game=new Game();
        if(aloneOrOtherPlayer.equals("a")){game.PaperRockplaygameWithComputer();}
        else if (aloneOrOtherPlayer.equals("p")){ game.PaperRockplaygame();}



    }
}
