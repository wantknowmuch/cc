package rank;

import java.util.Random;

/**
 * @author haozt
 * @date 2018/1/10 16:28
 */
public class ArrayUtil {
    public static int[] RandomArr(int len,int area){
        Random random = new Random();
        int[] arr = new int[len];
        for(int i = 0 ;i <len;i++){
            arr[i] = random.nextInt(area);
        }
        return arr;
    }
}
