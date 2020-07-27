public class PrimeNo{
  public static void main(String num[]){
    boolean flag = false;
    for(int i=0;i<num.length;i++){
      flag = false;   //reset flag for every value
      int n = Integer.parseInt(num[i]);
      for(int j=2;j<n/2;j++){
        if(n%j==0){
          flag = true;
          break;
        }
      }
      if(flag==false){
        System.out.println(n+" is Prime.");
      }
    }
  }
}
