public class FizzBuzz {
  public static String fizzBuzz(int number){
    // if divisib le by 3
    if (number %3 == 0 ){
      // and not divisible by 5
      if (number %5 != 0){
        System.out.println( "Fizz" );
      }
      // else it is divisible by 3 and by 5
      else {
        System.out.println( "FizzBuzz" );}
    }
    else if (number % 5 == 0){
      System.out.println( "Buzz" );}

    else {
      System.out.println( Integer.toString(number));
    }
    return null;
  }
}
