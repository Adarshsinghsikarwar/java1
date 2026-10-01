package advaceSorting;

public class quickSortAlgo {
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
        int pivot = arr[low] , pivotId = low;
        int smallest = 0;
        for (int i = low+1; i <= high; i++){
            if (arr[i] <= pivot) smallest++;
        }
        int correctIdx = pivotId + smallest;
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
    public static void quickSorting(int[] arr , int low , int high){
        if (low >= high) return;

        int idx = partition(arr, low , high);
        quickSorting(arr,low , idx-1);
        quickSorting(arr,idx+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,4,8,9,6};
        int n = arr.length;
        print (arr);
        quickSorting(arr,0,n-1);
        print(arr);

    }
}
