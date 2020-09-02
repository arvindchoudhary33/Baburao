import java.util.Scanner;

class Player{
  private static int totalRuns=0 ;
  private static int totalPlayers=0;
  private static int totalInnings = 0;
  private int jerNo; 
  private String name; 
  private int runs;
  private int inn; 
  private int notOut; 

  Scanner input = new Scanner(System.in);

  public void GetData(){
    System.out.println("Enter Jersey number: ");
    jerNo = input.nextInt();
    input.nextLine();
    System.out.println("Enter Player's name: ");
    name = input.nextLine();
    System.out.println("Enter runs: ");
    runs = input.nextInt();
    System.out.println("Enter innings played: ");
    inn = input.nextInt();
    System.out.println("Enter number of times not out: ");
    notOut = input.nextInt();
    totalRuns += runs;
    totalInnings += inn;
    totalPlayers++;
  }

  public void PutData(){
    System.out.println(" Jersy Number : "+jerNo+"\n Player Name : "+name+"\n Player Runs : "+runs+"\n Player Innings : "+inn+"\n Player Not Out For : "+notOut+" matches");
  }

  public String getName(){
    return name;
  }

  public int getRuns(){
    return runs;
  }

  public int getInnings_played(){
    return inn;
  }

  public static int getTotalPlayers(){
      return totalPlayers;
  }

  public static int getTotalRuns(){
    return totalRuns;
  }

  public static int getTotalInnings(){
    return totalInnings;
  }

  public int getJerNo(){
    return jerNo;
  }
}

public class CricPlay{

  public static void main(String[] ar){
    Scanner input = new Scanner(System.in);
    Player[] players= new Player[11];
    int choice , playerNo;

    do{
      System.out.println("Enter: \n 0.To Exit \n 1.To Add Player \n 2.To Find Average Runs Of Single Player \n 3.To Find Average Runs Of All The Players");
      choice = input.nextInt();
      switch(choice){
        case 0 : System.exit(0);
        case 1 : players[Player.getTotalPlayers()] = new Player();
                System.out.println("Enter details of player : ");
                players[Player.getTotalPlayers()].GetData();
                break;
        case 2 : System.out.println("Enter The Player Jersy Number Whose Average We Want : ");
                playerNo = input.nextInt();
                getAverageRuns(playerNo,players);
                break;
        case 3 : getAverageRuns();
                break;
        default : System.out.println("Wrong Choice !!!!!!!");
      }
    }while(choice != 0);
    input.close();
  }

  public static void getAverageRuns(int playerNo , Player[] players){
    Player playerFound = null;
    for(int i = 0 ; i < Player.getTotalPlayers() ; i++){
      if(players[i].getJerNo() == playerNo)
        playerFound = players[i];
    }
    if(playerFound == null){
      System.out.println("The Player With The Jersy Number "+playerNo+" Not Found");
    }
    else{
      playerFound.PutData();
      System.out.println("Average Runs By "+playerFound.getName()+" are : "+(playerFound.getRuns()/playerFound.getInnings_played()));
    }
  }

  public static void getAverageRuns(){
    System.out.println("Average Runs By The Team Are : " + (Player.getTotalRuns() / Player.getTotalInnings()));
  }
}
