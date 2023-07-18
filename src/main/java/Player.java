import java.util.Scanner;

public class Player {
    private String name;
    private String choice;
    private Scanner scanner=new Scanner(System.in);

    public Player(String name,String choice)
    {
        this.name=name;
        this.choice=choice;
    }
    public Player(){}
    public void setName(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String Setchoice(String choice)
    {

        if(choice.equals("Rock"))
        {
            return "Rock";
         } else if (choice.equals("Paper")) {

            return "Paper";
        } else if (choice.equals("Scissor")) {
            return "Scissor";
        }else {
                return"Invalid";
        }

    }


}
