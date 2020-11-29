/*Write a Java program to create a super class Vehicle having members Company and price.
Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the information
in appropriate form. While taking data, ask the user about the type of vehicle first. */

import java.util.*;

class Vehicle{
  private String Company;
  private float price;
  Scanner sc=new Scanner(System.in);
  void accept(){
    System.out.println("Enter Company name: ");
    Company = sc.next();
    System.out.println("Enter price: ");
    price = sc.nextFloat();
  }
  void display(){
    System.out.println("\nCompany name: "+Company+"\nPrice: "+price+" Lakhs.");
  }
}
class LMV extends Vehicle{
  private int mileage;
  void accept(){
    super.accept();
    System.out.println("Enter mileage: ");
    mileage = sc.nextInt();
  }
  void display(){
    super.display();
    System.out.println("Mileage: "+mileage+" kmph.\n");
  }
}
class HMV extends Vehicle{
  private int cap;
  void accept(){
    super.accept();
    System.out.println("Enter cap: ");
    cap = sc.nextInt();
  }
  void display(){
    super.display();
    System.out.println("Capacity: "+cap+" tons.\n");
  }
}
class VehicleMain{
  public static void main(String[] ar){
    Scanner sc=new Scanner(System.in);
    System.out.println("1. LMV \n2.HMV \nWhich type of Vehicle: ");
    int ch= sc.nextInt();
    System.out.println("How many vehicles: ");
    int n= sc.nextInt();
    switch(ch){
      case 1:
              LMV[] l=new LMV[n];
              for(int i=0; i<l.length;i++){
                l[i]=new LMV();
                l[i].accept();
                l[i].display();
              }
              break;
      case 2:
              HMV[] h=new HMV[n];
              for(int i=0; i<h.length;i++){
                h[i]=new HMV();
                h[i].accept();
                h[i].display();
              }
              break;
      default:
              System.out.println("Invalid Choice!!!");
    }
  }
}
