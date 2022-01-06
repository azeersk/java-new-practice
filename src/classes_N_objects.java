import java.util.Scanner;

class vehicle{
    public static void Details(String name, String color, int cast){
        System.out.println("Vehicle Name: "+ name+".");
        System.out.println("Vehicle Cast: "+ cast+".");
        System.out.println("Vehicle Color: "+ color+".");
    }

    public static void Features(){
        System.out.println("Vehicle maxSpeed: "+ 220+"km/h");
        System.out.println("Vehicle minSpeed: "+ 10+"km/h");
        System.out.println("Vehicle mileage: "+ "80 km/lit");
    }
}


public class classes_N_objects {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String color = input.nextLine();
        int cast = input.nextInt();
        vehicle objectOf = new vehicle();
        System.out.println("1).Details of the Vehicle!!");
        objectOf.Details(name,color,cast);
        System.out.println();
        System.out.println("2).Features of the vehicle!!");
        objectOf.Features();
    }
}
