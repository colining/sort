package colining.cn;

/**
 * Created by asus on 2017/3/27.
 */
public class QuickSort {

    public static int adjustArray(int array[], int left, int right) {
        //设置哨兵
        int key = array[left];
        while (left < right) {

            while (array[right] >= key && left < right)
                right--;
            if (left < right) {
                array[left] = array[right];
                left++;
            }

            while (array[left] < key && left < right)
                left++;
            if (left < right) {
                array[right] = array[left];
                right--;
            }
        }
        array[left] = key;
        return left;
    }

    public static int[] sort(int array[], int left, int right) {
        if (left < right) {
            int i = adjustArray(array, left, right);
            sort(array, left, i - 1);
            sort(array, i + 1, right);
        }
        return array;
    }

}
