package advaceSorting;

public class kthSmallestElement {
    static int ans;
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr , int low , int high){
        int mid = (low + high) / 2;
        int pivot = arr[mid] , pivotId = mid;
        int smallest = 0;
        for (int i = low; i <= high; i++){
            if (i==mid) continue;
            if (arr[i] <= pivot) smallest++;
        }
        int correctIdx = low + smallest;
        swap(arr, pivotId , correctIdx);
        int i = low , j = high;
        while (i < correctIdx && j > correctIdx){
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i] > pivot && arr[j] <= pivot ) {
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSorting(int[] arr , int low , int high ,int k){
        if (low > high) return;

        int idx = partition(arr, low , high);
        if(idx == k-1){
            ans = arr[idx];
            return;
        }
        if(idx > k-1)  quickSorting(arr,low , idx-1 ,k);
        else quickSorting(arr,idx+1,high,k);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,4,8,9,6};
        int n = arr.length;
        int k = 3;
         ans = 0;
        print (arr);
        quickSorting(arr,0,n-1, n-k+1);
        System.out.println(ans);

    }
}
