package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ArrayList list = threeSum(nums);
        for (Object object : list) {
            System.out.println(Arrays.toString((int[]) object));
        }
    }

    public static ArrayList threeSum(int[] nums) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        if ((nums[i] + nums[j] + nums[k]) == 0) {
                            int[] sumArr = new int[3];
                            sumArr[0] = nums[i];
                            sumArr[1] = nums[j];
                            sumArr[2] = nums[k];
                            Arrays.sort(sumArr);
                            if (!isDuplicate(list, sumArr)) {
                                list.add(sumArr);
                                sumArr = null;
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public static boolean isDuplicate(ArrayList list, int[] sumArr) {
        for (Object object : list) {
            if (Arrays.equals(((int[]) object), sumArr)) {
                return true;
            }
        }
        return false;
    }

}

