package niuke;

import java.util.ArrayList;

/**
 * @Author：Linzz
 * @Describe:
 * @Date：2024/5/14 14:30
 */
public class Solution {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        FullSort fullSort = new FullSort();
        ArrayList<ArrayList<Integer>> permute = fullSort.permute(num);
        System.out.println(permute);
    }
}
