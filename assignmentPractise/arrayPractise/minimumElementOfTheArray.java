package assignmentPractise.arrayPractise;

public class minimumElementOfTheArray {

    public static void main(String[] args) {
        int[] arr = {11,13,29,80,78,56,8};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < n ; i++){
            min = Math.min(arr[i],min);
        }
        System.out.println(min);
    }
}
