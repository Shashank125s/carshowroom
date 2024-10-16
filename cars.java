package carshowroom.src;
import java.util.Scanner;

public class cars extends Showroom implements utility {

    String car_name;
    String car_color;
    String car_fuel_type;
    String car_type;
    String car_transmission;
    int car_price;


    @Override
    public void getDetails(){
        System.out.println("Car Name: "+ car_name);
        System.out.println("Color: "+ car_color);
        System.out.println("Fuel Type: "+ car_fuel_type);
        System.out.println("Car Type: "+ car_type);
        System.out.println("Transmission: "+ car_transmission);
        System.out.println("Car Price: "+ car_price);


    }

    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== *** ENTER CAR DETAILS *** =====================");
        System.out.println();
        System.out.println("Car Name:");
        car_name = sc.nextLine();
        System.out.println("Car Color:");
        car_color = sc.nextLine();
        System.out.println("Fuel Type(Petrol/Diesel): ");
        car_fuel_type = sc.nextLine();
        System.out.println("Car Type(SUV/Sedan/Hatchback/Others): ");
        car_type = sc.nextLine();
        System.out.println("Transmission Type(Automatic/Manual)");
        car_transmission = sc.nextLine();
        System.out.println("Car Price: ");
        car_price = sc.nextInt();
        total_cars_in_stock++;  
    }

    
}
