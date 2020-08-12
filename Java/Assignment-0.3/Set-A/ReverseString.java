import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str , revStr;
        char[] strCharArray = new char[50];                 //for(intialization;condition;incre)
        char[] revStrCharArray = new char[50];
        System.out.println("Enter Strings : ");
        str = scan.nextLine(); // str = "Rutwik Shete"
        strCharArray = str.toCharArray(); // {'R','u'......} 
        for(int i  = strCharArray.length - 1 , j = 0 ; i >= 0 && j < strCharArray.length; i-- ,j++){
            // i = strCharArray.length - 1 = 11 - 1 = 10
            // j = 0
            revStrCharArray[j] = strCharArray[i];
            // revStrCharArray = {'e','t,'e','h','S',' ','k','i','w','t','u','R'} j (0 to 10)
            // strCharArray = {'R','u','t','w','i','k',' ','S','h','e','t','e'} i -> e to R(10 to  0)
        }
        revStr = new String(revStrCharArray); // etehS kiwtuR
        System.out.println("Reverse Of The String Is : " + revStr);
    }
}