// Write a JAVA program to convert a given decimal number to its hexadecimal equivalent. 

package Lab_2;

public class Q6 {
    public static String hexa(int n) {
      if(n==0)
      return "0";
      else
      {
          String hex=hexa(n/16);
          int rem=n%16;
          if(rem<10)
              return hex+rem;
          else{
              char ch=(char)(rem+55);
              return hex+ch;
          }
      }

    }
    public static void main(String[] args) {
        System.out.println( hexa(46));
    }
}