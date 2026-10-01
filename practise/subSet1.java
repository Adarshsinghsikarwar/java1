package practise;

import java.util.ArrayList;
import java.util.List;

public class subSet1 {
    static List<List<Integer>> ans;
    public static void print (int i , int[] nums, ArrayList<Integer> arr){
        if (i == nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr.size();j++){
                list.add(arr.get(j));
            }
            ans.add(list);
            return;

        }
        print(i+1,nums,arr);
        arr.add(nums[i]);
        print(i+1,nums,arr);
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        ans = new ArrayList<>();
        int[] nums = {1,2,3};
        ArrayList<Integer> arr = new ArrayList<>();
        print(0,nums,arr);
        System.out.println(ans);
    }
}
