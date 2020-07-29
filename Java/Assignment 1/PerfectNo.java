public class PerfectNo{
  public static void main(String args[]){
      int i;
      for(int j=1;j<=50;j++){		//iterates through range 1 to 50
        int sum = 0;			//intializing sum to 0 for every number
        for(i=1;i<=j/2;i++){		// divides the number(j) with every number(i) smaller than it 
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
