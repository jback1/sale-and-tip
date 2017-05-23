
import java.util.Scanner;

/**
 * Created by jienseock on 2017-05-22.
 */
public class main {
    public static void main(String[] args) {
        double price;
        double percentagesale;
        double tip;
        double total;
        double total2;
        Scanner scnr=new Scanner(System.in);
        System.out.println("How much do you need to pay all?");
        price=scnr.nextDouble();
        System.out.println("How much percentage sale?");
        percentagesale=scnr.nextDouble();
        System.out.println("How much percentage do you want to give as a tip?");
        tip=scnr.nextDouble();
        total=price-(price*percentagesale/100);
        total2=(total*tip/100);

        System.out.println("So your toal price is: "+price);
        System.out.println("Your total price with sale is : "+total);
        System.out.println("Your total tip is: " +total2);

        }
    }

