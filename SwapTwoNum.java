public class SwapTwoNum {
    public static void main(String[] args) {
        System.out.println("The Numbers Before Swapping Is:");
        int a,b;
        a=10;
        b=20;
        System.out.println("The Value of a is:"+ a);
        System.out.println("The Value of b is:"+ b);
        System.out.println("The Numbers after Swapping Is:");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a is:"+ a);
        System.out.println("The Value of a is:"+ b);
        
    }
}
