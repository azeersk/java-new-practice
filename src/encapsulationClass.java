import java.util.Scanner;

class bike{
    public static void setter(int Max){
        System.out.println("Maximum speed is: "+ Max);
    }
    public static void getter(int max){
        setter(max);
    }

    public static void setterOne(int Min){
        System.out.println("Minimum speed is: "+Min);
    }
    public static void getterOne(int Min){
        setterOne(Min);
    }
}


public class encapsulationClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        bike obj = new bike();
        int max = input.nextInt();
        int min = input.nextInt();
        obj.getter(max);
        System.out.println();

        obj.getterOne(min);
    }

}
