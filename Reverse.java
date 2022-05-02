/*Author: Jessica B
Date: 5/2/2022
Description: This program asks for a string input and produces the inputted string backwards*/

import java.util.Scanner;

public class Reverse
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a phrase: ");
      String phrase = input.nextLine();
      String phraseReverse = "";
      for (int x = phrase.length(); x > 0; x--)
      {
         phraseReverse += phrase.substring(x-1,x);
      }
      System.out.println(phraseReverse);
   }
}
