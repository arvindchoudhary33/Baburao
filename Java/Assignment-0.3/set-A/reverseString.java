//Ass-3 Set-A Q2
// 2.	Write a java program to print reverse of the String.

public class reverseString{
  public static void main(String ar[]){
    String rev = "";                                                //creating an empty string where we would store the reverse of the string
    String str=new String("Alpenlible");                            //creating instance of String class
    System.out.println("The Original string is: "+str);
    char c[]=str.toCharArray();                                     //converts thr string to character array
    for(int i=c.length-1;i>=0;i--){                                 //we access the string array from the last and go to the beginning
      rev += c[i];                                                  //adding the character to rev string
    }
    System.out.println("The reversed string is: "+rev);
  }
}


