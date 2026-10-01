package assignmentPractise.arrayPractise;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
    int[] nums1= {1,2,3,4,5};
    int n = nums1.length;
    int[] nums2= { 6,7,8,9};
    int m = nums2.length;
    int[] ans = new int[n+m];

    int i = 0, j =0 , k= 0;

    while (i < n && j < m){
        if (nums1[i] < nums2[j]){
            ans[k] = nums1[i];
            i++;
        }
        else {
            ans[k] = nums2[j];
            j++;
        }
        k++;
    }
    if (i == n){
        while ( j < m){
            ans[k] = nums2[j];
            k++;
            j++;
        }
    }

    if (j == m){
        while ( i < n){
            ans[k] = nums1[i];
            k++;
            i++;
        }
    }
    for ( int ele : ans){
        System.out.print(ele + " ");
    }
    }
}
