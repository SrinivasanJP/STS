import java.util.Scanner;

public class LongestSequenceONE {
    public static int longestOnes(int[] nums, int k) {
        int maxWindowSize = Integer.MIN_VALUE;
        int left=0;
        int right=-1;
        int zeros = 0;
        while(right++<nums.length-1){
            if(nums[right]==0){
                zeros++;
                while(zeros>k){
                    int eleStartWindow = nums[left++];
                    if(eleStartWindow==0) zeros--;  
                }
            }
            maxWindowSize = Math.max(maxWindowSize, right-left+1);
        }
        return maxWindowSize;
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(longestOnes(nums,2));
    }
}