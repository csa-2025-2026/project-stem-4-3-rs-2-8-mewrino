import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Problem 2
    /*int counter = 0;
    
    for (int i = 17; i <= 73; i++)
    {
      if (counter % 10 == 9)
      {
        System.out.println(i + " ");
      }
      else
      {
        System.out.print(i + " ");
      }
      counter++; 
    }
    
    // Problem 3
    System.out.println("enter a num between 0-50");
    int num = sc.nextInt();

    if (num <= 0 || num >= 50)
    {
      System.out.println("error");
    }
    else
    {
      int count = 0;
      for (int i = num; i <= 50; i++)
      {
        System.out.print(i + " ");
        count++;
        
        if (count % 5 == 0)
        {
          System.out.println();
        } 
      }
    } */

    // Problem 4
    System.out.println("enter any positive number");
    int num = sc.nextInt();

    if (num <= 0)
    {
      System.out.println("error");
    }
    else
    {
      int multiple = num - (num % 3);

      for (int i = multiple; i >= 0; i-= 3)
      {
        System.out.println(i + " ");
      }
    }
    System.out.print(" ");

  }
}
