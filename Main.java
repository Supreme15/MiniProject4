import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Type in number");
    int num = scan.nextInt();
    System.out.println("Num multiplied by:");
    int multiNum = scan.nextInt();
    
    int product = multi(num, multiNum);
    System.out.println("Your new number is " + product);

    System.out.println("Would yu like to add another number");
    boolean newNum = scan.nextBoolean();
  if(true)
    {
    int result = newNumber(newNum);
    System.out.println("Your new result " + result);
    }
  }

  //Multi method
  static int multi(int num, int multiNum)
  {
    int product = num * multiNum;
    return product;
  }
  //New number method
  static int newNumber(int newNum)
  {
    int result = product * newNum;
    return result;
  }
}