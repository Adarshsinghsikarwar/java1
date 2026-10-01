package assignmentPractise.arrayPractise;

public class arrayElementArePalindromeOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int flag = 1;
        while ( i < j){
            if (arr[i] != arr[j]) {
                flag = 0;
                break;
            }
            i++;
            j--;
        }
//        System.out.println(i);
        if (flag == 1)  System.out.println("Element of the array are palindrome ");
        else System.out.println("Element of the array are not palindrome ");
    }
}
