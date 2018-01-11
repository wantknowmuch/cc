package rank;

import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/10 16:26
 * 冒泡排序法
 */
public class BubbleRank {
   public static void main(String[] args){
       long a = System.currentTimeMillis();
       int[] arr = ArrayUtil.RandomArr(50000,100000000);
       sortArr(arr);
//       sort(arr);
//       rankArr(arr);
       System.out.println(Arrays.toString(arr));
       System.out.println(System.currentTimeMillis()-a+"ms");
   }
   //常规冒泡排序 数值大的往下沉
   public static int[] sortArr(int[] arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j = 0;j<arr.length-i-1;j++ ){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       return  arr;
   }
   //另一种写法  数值小的往上冒
   public static int[] sort(int[] arr){
       for(int i = 0;i<arr.length-1;i++){
           for(int j = arr.length -1; j>i;j--){
               if(arr[j-1]>arr[j]){
                   int temp = arr[j];
                   arr[j]  =arr[j-1];
                   arr[j-1] = temp;
               }
           }
       }
       return  arr;
    }

    /**
     * 冒泡排序法的优化
     * 对冒泡排序法最常见的优化方法是加入标志性变量 exchange，用来标志某一趟排序过程中是否有
     * 数据交换。如果进行某一趟排序中并没有数据交换，则可以中止排序，避免不必要的 比较过程。
     * @param arr
     * @return
     */
    public static int[] rankArr(int[] arr){
        boolean change = false;
        for(int i = 0 ;i<arr.length-1;i++){
            for(int j = arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   change = true;
                }
            }
            if(false == change)
                break;
        }
        return arr;
    }
}
