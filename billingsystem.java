import java.util.*;
public class orderingsystem
{
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu()
    {
        System.out.println("\t\t\t\t+==========================================+");
        System.out.println("                          LIST                      ");
        System.out.println("\t\t\t\t  1.WHEAT                           $. 45.00");
        System.out.println("\t\t\t\t  2.RICE                            $. 40.00");
        System.out.println("\t\t\t\t  3.TEA                             $. 30.00");
        System.out.println("\t\t\t\t  4.CANCEL                                 ");
        System.out.println("\t\t\t\t+==========================================+");
    }

    public static void order()
    {
        System.out.println("Press 1 to WHEAT , Press 2 to RICE , Press 3 to TEA , Press 4 to Cancel");
        System.out.print("Press you want to buy? :");
        choose = input.nextInt();
        if(choose==1)
        {
            System.out.println("You choose WHEAT");
            System.out.print("How many KG WHEAT you want to buy? :");
            quantity = input.nextInt();
            total = total + (quantity*45);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for No :");

            again = input.next();
            if(again.equalsIgnoreCase("Y"))
            {
                order();
            }
            else
            {
                System.out.println("enter a payment");
                pay = input.nextDouble();
                if(pay<=total)
                {
                    System.out.println("Not enough payment");
                }
                else
                {
                    System.out.println("Total price is" +total);
                    total = pay-total;
                    System.out.println("The change is" + total);
                }
            }
        }
        else if(choose==2)
        {
            System.out.println("You choose RICE");
            System.out.print("How many KG RICE you want to buy? :");
            quantity = input.nextInt();
            total = total + (quantity*40);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for No :");

            again = input.next();
            if(again.equalsIgnoreCase("Y"))
            {
                order();
            }
            else
            {
                System.out.println("enter a payment");
                pay = input.nextDouble();
                if(pay<=total)
                {
                    System.out.println("Not enough payment");
                }
                else
                {
                    System.out.println("Total price is" +total);
                    total = pay-total;
                    System.out.println("The change is" + total);
                }
            }
        }
        else if(choose==3)
        {
            System.out.println("You choose TEA");
            System.out.print("How many KG TEA you want to buy? :");
            quantity = input.nextInt();
            total = total + (quantity*30);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for No :");

            again = input.next();
            if(again.equalsIgnoreCase("Y"))
            {
                order();
            }
            else
            {
                System.out.println("enter a payment");
                pay = input.nextDouble();
                if(pay<=total)
                {
                    System.out.println("Not enough payment");
                }
                else
                {
                    System.out.println("Total price is" +total);
                    total = pay-total;
                    System.out.println("The change is" + total);
                }
            }
        }
        else if(choose==4)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("choose 1 to 4 only");
            order();
        }
    }
    public static void main(String args[])
    {
        menu();
        order();
    }
}