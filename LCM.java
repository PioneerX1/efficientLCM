import java.util.*;

public class LCM {
  // private static  gcd_naive( a,  b) {
  //    current_gcd = 1;
  //   for( d = 2; d <= a && d <= b; ++d) {
  //     if (a % d == 0 && b % d == 0) {
  //       if (d > current_gcd) {
  //         current_gcd = d;
  //       }
  //     }
  //   }
  //
  //   return current_gcd;
  // }

  private static long gcd_euclid(long a, long b) {
    long current_gcd = 1;
    long biggerNum, smallerNum;
    long remainder = 1;

    // figure out which is greater, a or b
    // divide larger by smaller as int as their is a remainder

    if (a == b) {
      return a;
    } else if (a > b) {
      biggerNum = a;
      smallerNum = b;
    } else {
      biggerNum = b;
      smallerNum = a;
    }

    while (remainder != 0) {
      remainder = biggerNum % smallerNum;
      biggerNum = smallerNum;
      smallerNum = remainder;
      if (remainder != 0) {
        current_gcd = remainder;
      }
    }

    return current_gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    //System.out.println(gcd_euclid(a, b));
    long euclidGCD = gcd_euclid(a, b);
    long multiplied = a * b;
    //System.out.println(multiplied);

    //long efficientLCM = (a * b)/euclidGCD;
    System.out.println(multiplied/euclidGCD);
  }
}
