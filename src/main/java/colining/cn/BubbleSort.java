package colining.cn;

import java.util.Arrays;

/**
 * Created by colin on 2017/5/26.
 */
public class BubbleSort {
    /*
    冒泡排序
     */

    //普通冒泡的做法
    public static int[] sort1(int array[]) {
        //每次冒泡都可以认为有有一个元素沉底，即一个元素有序了，
        //所以对n个元素，只需要排序n-1个，就一定有序了
        for (int i = 0; i < array.length - 1; i++) {
            //每次都有一个元素沉底，下次在比较就不需要比较这个元素了
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }

    //带标记的冒泡
    public static int[] sort2(int array[]) {
        boolean tag = true;
        for (int i = 0; i < array.length - 1 && tag; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                tag = false;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                    tag = true;
                }
            }
        }
        return array;
    }

    //鸡尾酒排序，在这个排序中也可加入tag，判断是否有元素交换
    public static int[] sort3(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            //向后找，找到最大的元素放到最后一位
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                }
            }
            //因为找到了最大值，所以右指针就不需要指向最后了
            right--;

            //依次向前找，将最小的元素放到第一位
            for (int j = right; j > left; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j-1);
                }
            }
            //找到最小值，所以左指针就向后移动一位
            left++;
        }
        return array;
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;

    }

}
