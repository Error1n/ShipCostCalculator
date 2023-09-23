import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      double itemPrice = 0.0;
      double shippingCost = 0.0;
      String trash = "";
      Scanner in = new Scanner(System.in);

        System.out.println("Enter the cost of your item: ");
        if(in.hasNextInt())
        {
            itemPrice = in.nextInt();
            in.nextLine(); //clears buffer
            if(itemPrice <= 99)
            {
                shippingCost = itemPrice * 0.02;

                System.out.println("Your shipping cost is: " + shippingCost);
            }
            else if(itemPrice >= 100)
            {
                System.out.println("Your shipping is free!");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input.");

        }


    }
}