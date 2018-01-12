package arithmetic;

import rank.ArrayUtil;

/**
 * @author haozt
 * @date 2018/1/12 17:05
 * 递归的使用
 */
public class Recursion {
    public static void main(String[] args){
        int sum = add(100);
        int[] arr = ArrayUtil.RandomArr(100,10000);
        int max = max(arr,0,arr.length-1);
        System.out.println("sum="+sum+",max="+max);
    }
    /**
     * 使用递归进行算数相加
     * @return
     */
    static int add(int n){
        if(1 == n){
            return n;
        }else{
            return add(n-1)+n;
        }
    }

    /**
     * 使用递归求数组中的最大值
     * @param arr  数组
     * @param low  数组下标
     * @param high 数组上标
     * @return
     */
    static int max(int[] arr,int low,int high){
        if(low > high -2){
            return arr[low]>arr[high] ? arr[low] :arr[high];
        }else {
            int middle = (high+low)>>1;
            int max1 = max(arr,low,middle);
            int max2 = max(arr,middle+1,high);
            return max1>max2 ? max1 :max2;
        }
    }
}
