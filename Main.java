import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner.next(System.in);

    System.out.println("Hello, want to hear a joke?");
    String name = scan.next();

    if (yes)
    {
      System.out.println(pun(name));
    }else{
      System.out.println(okay(name));
    }
  }

  //Pun method
  static String pun(String name)
  {
    String joke = "What type of sandals do frogs wear?";
    return joke;
  }

  //Fact method
  static int fact()
  {
    String answer = "Open-Toad!!!";
    return answer;
  }


  //Okay method
  static int okay(String name)
  {
    String bye = "Okay, have a good day!";
    return bye;
  }
}