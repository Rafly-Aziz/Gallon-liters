package Pbotgas;
import java.util.Scanner;

public class pbotgas{

    public static void main(String[] args){

        int gallons;
        double liters;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inputkan Gallon yang ingin di convert : ");
        gallons = scan.nextInt();


        liters = gallons *3.785;



        System.out.println(gallons + " gallons adalah " + liters + " liters.");



    }
}