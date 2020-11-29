/*Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes
Sphere(radius) , Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height)
from it. Calculate area and volume of all. (Use Method overriding). */
abstract class Shape{
double a,b,c;
abstract void calc_area();
abstract void calc_volume();
}
class Sphere extends Shape{

  Sphere(double a){
    this.a = a;
  }
  void calc_area(){
    double area = 4*3.14*a*a;
    System.out.println("Surface Area of Sphere is "+area+" square units.");
  }
  void calc_volume(){
    double vol= ((4/3)*3.14*a*a*a);
    System.out.println("Volume of Sphere is "+vol+" cubic units.\n");
  }
}
class Cone extends Shape{

  Cone(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  void calc_area(){
    double area = 3.14*b*(a+b);
    System.out.println("Surface Area of Cone is "+area+" square units.");
  }
  void calc_volume(){
    double vol= (3.14*b*b*c)/3;
    System.out.println("Volume of Cone is "+vol+" cubic units.\n");
  }
}
class Cylinder extends Shape{

  Cylinder(int b, int c){
    this.b = b;
    this.c = c;
  }
  void calc_area(){
    double area = 2*3.14*b*(c+b);
    System.out.println("Surface Area of Cylinder is "+area+" square units.");
  }
  void calc_volume(){
    double vol= (3.14*b*b*c);
    System.out.println("Volume of Cylinder is "+vol+" cubic units.\n");
  }
}
class Box extends Shape{

  Box(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  void calc_area(){
    double area = 2*(a*b+a*c+b*c);
    System.out.println("Surface Area of Box is "+area+" square units.");
  }
  void calc_volume(){
    double vol= a*b*c;
    System.out.println("Volume of Box is "+vol+" cubic units.\n");
  }
}
class abstrcls2
{
public static void main(String args[])
{
Sphere s=new Sphere(4);
s.calc_area();
s.calc_volume();
Cone c=new Cone(6,3,10);
c.calc_area();
c.calc_volume();
Cylinder cc=new Cylinder(5,7);
cc.calc_area();
cc.calc_volume();
Box b=new Box(2,3,4);
s.calc_area();
s.calc_volume();
}
}
