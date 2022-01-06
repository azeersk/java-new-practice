public class loopClass {
    public static void main(String[] args){
        int Count = 5;

        System.out.println("  Rectangles  ");
        System.out.println("****************");
        System.out.println();
        for(int i=1; i<=Count; i++){
            if(i==1 || i==Count)
                System.out.println(" *  ".repeat(Count));
            else
                System.out.println(" *  "+ "    ".repeat(Count-2) + " *  ");
        }
        for(int j=1; j<=Count; j++){
            if(j==1 || j==Count)
                System.out.println(" *  ".repeat(Count));
            else
                System.out.println(" *  "+ "    ".repeat(Count-2) + " *  ");
        }

        System.out.println("  Triangle Shape ");
        System.out.println("********************");
        System.out.println();
        while(Count>0){
            System.out.println("  ".repeat(Count)+" *  ".repeat(6-Count));
            Count--;
        }
    }
}
