public class SumOfNatNor {
    public static void main(String[] args) {
        int N=10;
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=i+sum;
        }
        System.out.println("The Sum Of "+ N + "Natural Numbers is:"+sum);
    }
}
