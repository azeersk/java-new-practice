class details{
    public static void student(String n, int cl, int age){
        System.out.println("Student Name: "+n);
        System.out.println("Student Class: "+cl);
        System.out.println("Student Age: "+age);
    }

    public static void Marks(int m, int p, int c, int e, int s){
        System.out.println("Maths Marks: "+ m);
        System.out.println("Physics Marks: "+ p);
        System.out.println("Chemistry Marks: "+ c);
        System.out.println("English Marks: "+ e);
        System.out.println("Sanskrit Marks: "+ s);
    }
}

 class school extends details{
    public static void StReportCard(String n, int cl, int age, int m, int p, int c, int e, int s){

        student(n,cl,age);
        Marks(m,p,c,e,s);
    }
 }


public class inheritanceClass {
    public static void main(String[] args){
        school obj = new school();

        obj.StReportCard("saheb",9,15,75,53,60,79,98);
    }
}
