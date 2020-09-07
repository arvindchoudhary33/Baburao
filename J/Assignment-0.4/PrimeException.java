import java.lang.Exception;

class InvalidInputZeroException extends Exception{


    private static final long serialVersionUID = 1L;

    public InvalidInputZeroException() {
    }

    void print(){
        System.out.println("Zero Or Less Than Zero Is And Invalid Entery");
    }

    static class NumberTester{
        void check(final int number) throws InvalidInputZeroException {
            if(number <= 0)
                throw new InvalidInputZeroException();
        }
    }
}

public class PrimeException {
    public static void main(final String num[]){
        final InvalidInputZeroException.NumberTester numberTester = new InvalidInputZeroException.NumberTester();
        boolean flag = false;			//initializing a flag
        for(int i=0;i<num.length;i++){		//iterating through number of arguments
          flag = false;   				//reset flag for every value
          final int n = Integer.parseInt(num[i]);		//Converting the argument(although number but a str type) into integer
          try{ 
                numberTester.check(n);
                for(int j=2;j<=n/2;j++){			//will divide number from 2 to half of its value
                    if(n%j==0){				
                    flag = true;				//if number is divisible by any other number flag sets true	
                    break;
                    }
                }
                if(flag==false){				//wil print only if flag is false
                    System.out.println(n+" is Prime.");
                }
                else{
                    System.out.println(n+" is Not Prime.");
                }
            }
            catch(final InvalidInputZeroException e){
                e.print();
            }
        }
      }
}
