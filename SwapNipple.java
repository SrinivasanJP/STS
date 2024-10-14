import java.util.Scanner;

public class SwapNipple{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString((n&0x0F)<<4 | (n&0xF0)>>4));
        scan.close();
    }
}