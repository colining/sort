package colining.cn;

/**
 * Created by colin on 2017/5/26.
 */
public class InsertionSort {
    /*
    插入排序
     */
    public static int[] sort1(int[] array) {
        //对于n个数，只需要排列n-1次；
        for (int i = 0; i < array.length - 1; i++) {
            //可以认为是每次的一个新元素放入已有序的序列中，
            //然后不断地向前插入直到适合的位置
            //这样写相当于j是新来的元素，前面是有序的
            for (int j = i + 1; j > 0; j--) {
                if (array[j - 1] < array[j]) {
                    break;
                }
                swap(array, j - 1);
            }
        }
        return array;
    }

    public static int[] sort2(int[] array) {
        //这样写代表i是新来的，所以它需要和前面的[i-1 ~ 0]进行比较
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            //将先来的i元素和前面的[j~0]进行比较
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static int[] sort3(int[] array) {
        //i是新来的，前面序列有序，然后进行相邻交换
        //这不是冒泡哦
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1;j>=0&& array[j]>array[j+1];j--) {
                swap(array,j);
            }
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
