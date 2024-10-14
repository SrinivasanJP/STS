import java.util.Scanner;

public class BinaryPalindrome {
    private static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        System.out.println(j);
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = Integer.toBinaryString(scan.nextInt());
        System.out.println(data);
        System.out.println(isPalindrome(data));
        scan.close();
    }
}
