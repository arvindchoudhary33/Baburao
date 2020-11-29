import java.util.*;
interface CreditCardInterface{
  //void viewCreditAmount();
  void payCredit();
  void useCard();
  void increaseLimit();
}
class SCC implements CreditCardInterface{
  private String name;
  private String card_no;
  private float amount;
  private float creditAmount;
  private float creditLimit;
  SCC(){
    creditAmount = 0;
    creditLimit = 50000;
  }
  void accept(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Card number, name and amount: ");
    card_no=sc.next();
    if(card_no.length()==16){
      name=sc.next();
      creditAmount=sc.nextInt();
    }
    else{
      System.out.println("Card number should be 16 digits.");
    }
  }
  void display(){
    System.out.println("Card name is "+name+"\nnumber is "+card_no);
  }
  public void useCard(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter new purchase's amount: ");
    amount = sc.nextFloat();
    if(creditAmount+amount<=creditLimit){
      creditAmount += amount;
      System.out.println("Credit Amount is: "+creditAmount);
    }
    else{
      System.out.println("\n Transaction Failed! Credit Limit surpassed!");
    }
  }
  public void payCredit(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount paid back: ");
    amount = sc.nextFloat();
    if(amount-creditAmount<=creditLimit){
      creditAmount -= amount;
      System.out.println("The credit amount is "+creditAmount);
    }
    else{
      System.out.println("Transaction Failed!");
    }
 }
 public void increaseLimit(){}
}
class GCC implements CreditCardInterface{
  private String name;
  private String card_no;
  private float amount;
  private float creditAmount;
  private float creditLimit;
  GCC(){
    creditAmount = 0;
    creditLimit = 100000;
  }
  void accept(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Card number, name and amount: ");
    card_no=sc.next();
    if(card_no.length()==16){
      name=sc.next();
      creditAmount=sc.nextInt();
    }
    else{
      System.out.println("Card number should be 16 digits.");
    }
  }
  void display(){
    System.out.println("Card name is "+name+"\nnumber is "+card_no);
  }
  public void useCard(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter new purchase's amount: ");
    amount = sc.nextFloat();
    if(creditAmount+amount<=creditLimit){
      creditAmount += amount;
      System.out.println("Credit Amount is: "+creditAmount);
    }
    else{
      System.out.println("\n Transaction Failed! Credit Limit surpassed!");
    }
  }
  public void payCredit(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount paid back: ");
    amount = sc.nextFloat();
    if(amount-creditAmount<=creditLimit){
      creditAmount -= amount;
      System.out.println("The credit amount is "+creditAmount);
    }
    else{
      System.out.println("Transaction Failed!");
    }
 }
public void increaseLimit(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter amount to increae limit: ");
  amount=sc.nextFloat();
  if(amount>10000){
    System.out.println("Amount Exceeded!");
  }
  else{
    creditLimit += amount;
  }
  System.out.println("The Credit limit is: "+creditLimit);
 }
}
class creditdemo{
  public static void main(String[] ar){
    System.out.println("1. SCC \n2. GCC \nEnter Choice: ");
    Scanner sc=new Scanner(System.in);
    int ch= sc.nextInt();
    switch(ch){
      case 1:
        SCC s=new SCC();
        s.accept();
        s.display();
        s.useCard();
        s.payCredit();
        break;
      case 2:
        GCC g=new GCC();
        g.accept();
        g.display();
        g.useCard();
        g.payCredit();
        g.increaseLimit();
        break;
      default:
        System.out.println("Invalid Choice!!");
    }
  }
}
