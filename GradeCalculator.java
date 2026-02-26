public class GradeCalculator {
    public static void main(String[] args) {
        int a;
        a=200;
        if(a>=90){
            System.out.println("A Grade");
        }
        else if(a>=75 && a==89){
            System.out.println(" B Grade");
        }
        else if(a>=50 && a==74)
        {
            System.out.println(" C Grade");
        }
        else 
        {
             System.out.println(" Fail ");
        }
    }
}
