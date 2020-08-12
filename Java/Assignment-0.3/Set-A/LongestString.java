import java.util.Scanner;
public class LongestString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] str = new String[10];
        System.out.println("Enter How many Strings : ");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter String : ");
            str[i] = scan.nextLine(); 
        }
        int max = 0;
        int ind = 0;
        int len = 0;
        for(int j = 0 ; j < n ; j++){
            len = str[j].length();
            if(len > max){ 
                max = len; 
                ind = j;
            }
        }
        System.out.println("Longest String is : " + str[ind]);
    }
}