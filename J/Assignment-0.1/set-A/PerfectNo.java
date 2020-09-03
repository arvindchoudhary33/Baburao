// Assign-1-Program-3

/* A perfect number is a positive integer that is equal to the sum of its positive divisors, 
   excluding the number itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 
   is a perfect number.  KudosYouGotIt.  ( source-Wikipedia ( excluding the kudos part )).
*/

// It's a java program to  find perfect numbers between 1-50 . 


public class PerfectNo{
  public static void main(String args[]){
      int i;
      for(int j=1;j<=100;j++){		//iterates through range 1 to 50
        int sum = 0;			//intializing sum to 0 for every number
        for(i=1;i<j;i++){		// divides the number(j) with every number(i) smaller than it 
          if(j%i==0){
            sum += i;			//adds number(i) to sum if number(j) is divisible by it
          }
        }
        if(sum==j){			//if addition of factors is equal to the original number
          System.out.println(j+" is a perfect no.");
        }
      }
  }
}


/* 

  If you want to check a specific Number from User ( is perfect number or not )



import java.util.Scanner;
public class Perfect
{
    public static void main(String[] ninjaHattori) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println(" is Perfect");
        }
        else
        {
            System.out.println(" not a  Perfect");
        }    
    }
    
}


*/
