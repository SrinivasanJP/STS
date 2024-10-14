public class MajorityEle{
    private static void printMajority(int arr[], int n){
        int majority = -1;
        int count = 0;
        int majorityCount = 0;
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>majorityCount){
                majorityCount = count;
                majority = i;
            }
        }
        if(n/2<majorityCount){
            System.out.println(arr[majority]);
        }else{
            System.out.println("NULL");
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,3,4,2,4,4,2,4,4};
        printMajority(arr, arr.length);
    }
}