import java.util.Scanner;

abstract class Example{
    abstract void show(int b);
    public static void MainAb(int a){
        System.out.println(a +". This is normal method in abstract class! !");
    }
}

class abstractEx extends Example{
    public void show(int b){
        MainAb(b-1);
        System.out.println();
        System.out.println(b+ ". This abstract method! ! ");
    }

}


public class abstractClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        abstractEx objAb = new abstractEx();

        objAb.show(a);
    }
}

