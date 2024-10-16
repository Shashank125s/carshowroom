package carshowroom.src;

import java.util.Scanner;

public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_in_stock = 0;
    String manager_name;


    @Override
    public void getDetails(){
        System.out.println("Showroom Name:"+showroom_name);
        System.out.println("Showroom Address:"+ showroom_address);
        System.out.println("Manager Name:"+manager_name);
        System.out.println("Total Employees:"+total_employee);
        System.out.println("Total cars in stock:"+ total_cars_in_stock);
    }
    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== *** ENTER SHOWROOM DETAILS *** =====================");
        System.out.println();
        System.out.println("SHOWROOM NAME:");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME");
        manager_name = sc.nextLine();
        System.out.println("TOTAL NO.OF EMPLOYEES");
        total_employee = sc.nextInt();
        System.out.println("TOTAL NO.OF CARS IN STOCK");
        total_cars_in_stock = sc.nextInt(); 



    }
    
}
