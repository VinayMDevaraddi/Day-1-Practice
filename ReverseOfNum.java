public class ReverseOfNum {
    public static void main(String[] args) {
        int num=1234;
        int reverse =0;
        while(num>0){   //the loop keeps running as long as num is greater than 0.
            int lastdigit=num%10;  //% gives the remainder & 1234 % 10 = 4 → last digit is 4
            reverse=reverse*10+lastdigit; //Initially, reverse = 0 → 0*10 + 4 = 4, Now reverse = 4
            //Remove last digit from num
            num = num / 10; //Integer division removes the last digit: 1234 / 10 = 123
            //Now num = 123

        }
        System.out.println("The Reversed Number Is:" + reverse);
    }
}

/*public class ReverseString {
    public static void main(String[] args) {

        String str = "abcd";
        String reverse = "";

        int i = str.length() - 1;

        while (i >= 0) {
            reverse = reverse + str.charAt(i);
            i--;
        }

        System.out.println("Reversed string is: " + reverse);
    }
} */