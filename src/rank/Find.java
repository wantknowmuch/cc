package rank;

import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/12 13:38
 * 二分查找
 */
public class Find {

    /**
     * 对于一个有序的数组可以使用下面二分法进行查找
     * @param arr  数组
     * @param searchKey 查找元素
     * @return
     */
    public static int find(int[] arr,int searchKey){
        int lowerBound = 0;
        int highBound = arr.length-1;
        int currentIndex;
        while (lowerBound<=highBound){
            currentIndex = (lowerBound+highBound)>>1;
            if(arr[currentIndex] == searchKey){
                return currentIndex;
            }else{
                if(arr[currentIndex]<searchKey){
                    lowerBound = currentIndex+1;
                }else{
                    highBound = currentIndex-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = ArrayUtil.RandomArr(5,10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a = find(arr,5);
        if(a!=-1){
            System.out.println("产生的随机数有5，随机数在数组的第"+(a+1)+"位");
        }else{
            System.out.println("产生的随机数中没有5");
        }

    }
}
