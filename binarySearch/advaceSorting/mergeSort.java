package advaceSorting;

public class mergeSort {
    public static void print (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a , int[] b , int[] c){
        int i = 0 , j = 0 , k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[i])  c[k++] = a[i++];
            else  c[k++] = b[j++];
        }
        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }
    public static void mergeSorting(int[] arr){
        int n = arr.length;
        if (n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n- n/2; i++) b[i] = arr[i+n/2];

        mergeSorting(a);
        mergeSorting(b);

        merge(a,b,arr);
        a= null ;
        b = null;


    }
    public static void main(String[] args) {
        int[] arr = {38,23,12,90,76,37,74};
        print(arr);
        mergeSorting(arr);
        print(arr);

    }
}
