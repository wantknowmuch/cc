package rank;

import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/11 13:30
 */
public class InsertRank {
    /**
     *
     * @param arr
     * @return
     * 每次进行比较，确保在i前面的数的顺序是排列好的
     * 循环遍历数组，每次给temp即数组下标i所对应的数字找个合适的位置
     * 所以内层循环应该采用倒序遍历 进行比较 交换顺序
     */
    public static int[] insertSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j = 0;
            int temp = arr[i];
            for( j= i-1;j>=0 && temp<arr[j];j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = ArrayUtil.RandomArr(5,100);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
