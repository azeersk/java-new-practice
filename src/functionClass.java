public class functionClass {
    public static void Calculations(int a, int b){
        System.out.println("Addition of: "+ (a+b));
        System.out.println("Substraction of: "+ (a-b));
        System.out.println("Multiplication of: "+ (a*b));
        System.out.println("Division of: "+ (a/b));
        System.out.println("Modulo of: "+ (a%2));
    }

    public static void loopFunction(int a){
        System.out.println("Loop Function ");
        System.out.println("----------------");
        for(int i=0; i<=10; i++){
            System.out.println(a +" x "+  i + " = "+(i*a));
        }
    }

    public static void main(String[] args){
        System.out.println(" Functions ");
        System.out.println("------------");
        int a = 10;
        int b = 5;
        Calculations(a,b);
        System.out.println();
        loopFunction(9);
        System.out.println();
        loopFunction(10);
    }
}
