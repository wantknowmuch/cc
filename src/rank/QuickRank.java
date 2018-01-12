package rank;

import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/11 10:03
 * 基本思想：通过一趟排序将需要排序的数分割成2部分：左边都是比基数小的数 右边都是比基数大的数
 */
public class QuickRank {
    public static void main(String[] args){
        long a = System.currentTimeMillis();
        int[] arr = ArrayUtil.RandomArr(50000000,1000000000);
//        quickSort(arr,0,arr.length-1);
        //java中的sort排序 使用的是 快速排序和归并排序
        Arrays.sort(arr);
        System.out.println(System.currentTimeMillis()-a+"ms");
    }
    //执行一次快排交换顺序 分治
    public static int division(int left,int right,int[] arr){
        int base = arr[left];
        while(left<right){
            //右—》左
            while (left <right && arr[right] >= base){
                right--;
            }
            arr[left] = arr[right];
            //左—》右
            while (left<right && arr[left]<= base){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }
    public static int[] quickSort(int[] arr, int left,int right){
        if(left<right){
            int base = division(left,right,arr);
            //对 基数 右边的数 继续进行快排
            quickSort(arr,base+1,right);
            //对基数 左边的数 继续进行快排
            quickSort(arr,left,base-1);
        }
        return arr;
    }
}
