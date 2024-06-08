package niuke;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author：Linzz
 * @Describe:
 * @Date：2024/5/14 13:43
 */
public class FullSort {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param num int整型一维数组
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(num);
        build(num,res,list);
        return res;
    }

    private void build(int[] num,ArrayList<ArrayList<Integer>> res,
                      ArrayList<Integer> list) {

        if (list.size() == num.length) {
            res.add(new ArrayList<>(list));
            return;

        }

        for(int i = 0; i < num.length; i++) {
            if (list.contains(num[i])) {
                continue;
            }
            list.add(num[i]);
            //迭代
            build(num, res, list);
            //回溯
            list.remove (list.size() - 1);
        }
    }


}
