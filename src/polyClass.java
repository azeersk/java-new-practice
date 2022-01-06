import java.util.Scanner;

class myVehicle{
    public static void carDetails(){
        System.out.println("Ferrari car.");
        System.out.println("Car Cast is 3.5Cr.");
        System.out.println("Car color is Red.");
    }

    public static void carDetails(String color){
        System.out.println("Benz Car.");
        System.out.println("Car cast is 25Lacs.");
        System.out.println("Car color " + color + "." );
    }
}

public class polyClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        myVehicle objVehicle = new myVehicle();
        objVehicle.carDetails();

        System.out.println("enter car color: ");
        String color = input.nextLine();
        objVehicle.carDetails(color);

    }
}
