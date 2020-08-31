import java.util.Scanner;
public class CricPlay{
  int jerNo; String name; int runs;
  int inn; int notOut; int avgRun;
  //int[] allRuns; int[] allInn;
  Scanner sc=new Scanner(System.in);

  void GetData(){
    System.out.println("Enter Jersey number: ");
    jerNo = sc.nextInt();
    System.out.println("Enter Player's name: ");
    name = sc.next();
    System.out.println("Enter runs: ");
    runs = sc.nextInt();
    System.out.println("Enter innings played: ");
    inn = sc.nextInt();
    System.out.println("Enter number of times not out: ");
    notOut = sc.nextInt();
  }

  void PutData(){
    System.out.println(jerNo+"\t"+name+"\t"+runs+"\t"+inn+"\t"+notOut+"\t Average runs: "+(runs/inn));
  }

  public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of players: ");
    int n = sc.nextInt();

    CricPlay[] cp= new CricPlay[n];
    for(int i=0;i<n;i++){
      cp[i] = new CricPlay();
      System.out.println("Enter details of player "+(i+1)+": ");
      cp[i].GetData();
    }
    System.out.println("\n Details of Players is:\n");
    for(int j=0; j<n; j++){
      cp[j].PutData();
    }
  }
}
