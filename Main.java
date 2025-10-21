import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 2

    int counter = 0;
    

    for (int i = 17; i <= 73; i++)
    {
      if (counter % 10 == 0)
      {
        System.out.println(i + " ");

    }
    else
    {
      System.out.print(i + " ");
    }
    counter++;

  }

}
}
