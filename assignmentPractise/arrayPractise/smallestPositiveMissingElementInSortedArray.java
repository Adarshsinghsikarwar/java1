package assignmentPractise.arrayPractise;

public class smallestPositiveMissingElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println(smallestPositive(arr));
        for ( int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static int smallestPositive(int[] arr) {
        int index = 1;
        for (int ele : arr){
            if ( index == ele){
                index++;
            }
        }
        return index;
    }
}
