public class LargestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        a=100;
        b=20;
        c=30;
        System.out.println("The Largest Among Three Is:");
        if(a>=b && a>=c)
        {
            System.out.println("The a is largest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("The b is Largest");

        }
        else
        {
            System.out.println("The c Is The Largest");
        }
            
    }
}
