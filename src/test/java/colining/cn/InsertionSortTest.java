package colining.cn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by colin on 2017/5/26.
 */
public class InsertionSortTest {
    int array[] = {2, 1, 3, 5, 8, 4, 6, 9, 7};
    int expectArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    @Test
    public void sort1() throws Exception {
        assertArrayEquals(expectArray,InsertionSort.sort1(array));
    }
    @Test
    public void sort2() throws Exception {
        assertArrayEquals(expectArray,InsertionSort.sort2(array));

    }
    @Test
    public void sort3() throws Exception {
        assertArrayEquals(expectArray,InsertionSort.sort3(array));

    }
}