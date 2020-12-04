// Define an abstract class “Staff” with members name and address. Define two sub-classes of this class – “FullTimeStaff” (department, salary) and “PartTimeStaff” (number-of-hours, rate-perhour). Define appropriate constructors. Create n objects which could be of either FullTimeStaff or PartTimeStaff class by asking the user’s choice. Display details of all “FullTimeStaff” objects and all “PartTimeStaff” objects. 
import java.util.Scanner;

abstract class Staff{
  String name;
  String address;
  abstract void accept();
  abstract void display();
}

class FTS extends Staff{
  private String department;
  private float salary;

  //FTS(String name, String address){
    //this.name = name;
    //this.address = address;
  //}
  Scanner sc=new Scanner(System.in);
  void accept(){
    System.out.println("Enter Employee's name: ");
    name = sc.next();
    System.out.println("Enter Employee's address: ");
    address = sc.next();
    System.out.println("Enter department's name: ");
    department = sc.next();
    System.out.println("Enter salary: ");
    salary = sc.nextFloat();
  }
  void display(){
    System.out.println(name+"\t"+address+"\t"+department+"\t"+salary+"\n");
  }
}

class PTS extends Staff{
  private int noh;
  private float rph;

  //PTS(int noh, float rph){
  //  this.noh = noh;
  //  this.rph = rph;
  //}
  Scanner sc=new Scanner(System.in);
  void accept(){
    System.out.println("Enter Employee's name: ");
    name = sc.next();
    System.out.println("Enter Employee's address: ");
    address = sc.next();
    System.out.println("Enter number of hours: ");
    noh = sc.nextInt();
    System.out.println("Enter rate per hour: ");
    rph = sc.nextFloat();
  }
  void display(){
    System.out.println(name+"\t"+address+"\tnumber-of-hour- "+noh+"\trate-per-hour- "+rph+"\n");
  }
}

class StaffMain{
  public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    System.out.println("1. FTS \n2.PTS \nWhich type of Staff: ");
    int ch= sc.nextInt();
    System.out.println("How many employees: ");
    int n= sc.nextInt();
    switch(ch){
      case 1:
              FTS[] l=new FTS[n];
              for(int i=0; i<l.length;i++){
                l[i]=new FTS();
                l[i].accept();
                l[i].display();
              }
              break;
      case 2:
              PTS[] h=new PTS[n];
              for(int i=0; i<h.length;i++){
                h[i]=new PTS();
                h[i].accept();
                h[i].display();
              }
              break;
      default:
              System.out.println("Invalid Choice!!!");
    }
  }
}
