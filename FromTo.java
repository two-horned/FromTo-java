import java.util.Scanner;
import java.lang.Math;

class FromTo {
  private static int toDec(int a, int b) {
    int s = 0;
    if(a == 0) {
      return 0;
    }
    int i = 0;
    int c;
    while(a>0) {
      c = a%10;
      a -= c;
      a /= 10;
      if(c>=b) {
        System.out.println("Input Error");
        System.exit(1);
      }
      s += Math.pow(b,i) * c;
      i++;
    }
    return s;
  }

  private static void toBin(int a, int b) {
    String s = "";
    if(a==0) {
      System.out.println("0");
      return;
    }
    int c;
    while(a>0) {
      c = a%b;
      a -= c;
      a /= b;
      s = String.valueOf(c) + s;
    }
    System.out.println(s);
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input of Number: ");
    int a = Integer.parseInt(input.nextLine());
    System.out.print("Input of Original Base: ");
    int b = Integer.parseInt(input.nextLine());
    System.out.print("Input of Future Base: ");
    int c = Integer.parseInt(input.nextLine());

    if(c<2) {
      System.out.println("Input Error");
    } else {
      toBin(toDec(a,b),c);
    }
  }
}
