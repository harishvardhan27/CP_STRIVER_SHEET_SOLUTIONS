import java.util.Scanner;

public class A_Chewbacca_and_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        String s = sc.next();
        StringBuilder st = new StringBuilder();
        for(int i = 0 ; i < s.length();i++) {
            int digit = s.charAt(i) - '0';
            int inverted = 9 - digit;
            if(i == 0 && inverted == 0 ) st.append(digit);
            else{
                st.append(Math.min(digit,inverted));
            }
        }
        System.out.println(st.toString());
    }
}