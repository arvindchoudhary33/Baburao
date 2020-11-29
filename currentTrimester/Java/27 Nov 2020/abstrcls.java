import java.util.*;

abstract class figure
{
int a,b;
//Scanner sc=new Scanner(System.in);
abstract void area();
abstract void perimeter();
}
class square extends figure
{
  square(int a){
    this.a = a;
  }
  void area()
  {
  //System.out.println("Enter side for square  ");
  //a=sc.nextInt();
  int ar=a*a;
System.out.println("\n The area of square is: "+ar);
}
void perimeter()
{
int pr=4*a;
System.out.println("\n The perimeter of square is: "+pr);
}
}
class rectangle extends figure
{
  rectangle(int a, int b){
    this.a = a;
    this.b = b;
  }
void area(){
//System.out.println("Enter length and breadth for rectangle");
//a=sc.nextInt();
//b=sc.nextInt();
int ar=a*b;
System.out.println("\n The area of rectangle is: "+ar);
}
void perimeter()
{
int pr=2*(a+b);
System.out.println("\n The perimeter of rectangle is: "+pr);
}
}

class abstrcls
{
public static void main(String args[])
{
square s=new square(10);
s.area();
s.perimeter();
rectangle r=new rectangle(3,4);
r.area();
r.perimeter();
}
}
