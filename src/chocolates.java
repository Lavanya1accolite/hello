import java.io.*;
import java.util.Scanner;

class GFG {

    // Returns maximum number of chocolates
    // we can eat with given money, price
    // of chocolate and number of wrapprices
    // required to get a chocolate.
    static int countMaxChoco(int money,
                             int price, int wrap)
    {

        // Corner case
        if (money < price)
            return 0;

        // First find number of chocolates
        // that can be purchased with the
        // given amount
        int choc = money / price;

        // Now just add number of chocolates
        // with the chocolates gained by
        // wrapprices
        choc = choc + (choc - 1) / (wrap - 1);
        return choc;
    }


}

public class chocolates {
    // Driver code
    public static void main (String[] args)
    {

        GFG obj=new GFG();
        // total money
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the money present");
        int money = sc.nextInt();

        // cost of each candy
        System.out.println("enter the price of each candy");
        int price = sc.nextInt();

        // no of wrappers needs to be
        System.out.println("enter the wrap");
        int wrap = sc.nextInt() ;

        // exchanged for one chocolate.
        System.out.println(
                obj.countMaxChoco(money, price, wrap));
    }
}
