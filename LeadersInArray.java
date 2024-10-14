import java.util.ArrayList;

public class LeadersInArray {

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 2} ;
        int max = arr[arr.length-1];
        result.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max = arr[i];
                result.add(max);
            }
        }
        for (Integer result2 : result) {
            System.out.print(result2+" ");
        }
    }
}
