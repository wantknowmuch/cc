package rank;

import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/12 14:30
 * 选择排序法
 * 原理：外层循环控制轮数，设置循环次数，内层循循环每次找出比较数组中的最小元素，
 * 在和外层第i个元素进行位置交换，完成排序
 */
public class ChooseRank {
    public static void main(String[] a){
        int[] arr  = ArrayUtil.RandomArr(500000,1000000);
        chooseSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public static int[] chooseSort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            int least = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[least]){
                    least = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp;
        }
        return arr;
    }
}
