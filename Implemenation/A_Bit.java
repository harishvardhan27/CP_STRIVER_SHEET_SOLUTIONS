import java.util.Scanner;
public class A_Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t-->0){
            String s = sc.next();
            if(s.equals("X++") || s.equals("++X")) {
                count++;
            }
            else count--;
        }
        System.out.println(count);
    }
}