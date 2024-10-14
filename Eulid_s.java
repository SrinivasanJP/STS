import java.util.Scanner;

public class Eulid_s {
    private static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("GCD: "+ gcd(scan.nextInt(), scan.nextInt()));
        scan.close();
    } 
}
