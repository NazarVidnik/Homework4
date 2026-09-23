package part1;
import java.util.Scanner;
public class Assignment4Part2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        final double gallons_in_meter = 264.17; // constants
        final double galon_price = 0.24; // in Ukraine
        System.out.printf("Enter lenght of your pool (in meters)");//inputting value
        double lenght = cin.nextDouble();
        System.out.printf("Enter depth of your pool (in meters)");
        double depth = cin.nextDouble();
        System.out.printf("Enter width of your pool (in meters)");
        double width = cin.nextDouble();

        double volume = lenght * depth * width;  //calculations
        double galons = volume * gallons_in_meter;
        double final_price = galons * galon_price;
        System.out.printf("Final price of water is : %.2f", final_price);
    }
}