package colining.cn;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by colin on 2017/5/26.
 */
public class BubbleSortTest {
    int array[] = {2, 1, 3, 5, 8, 4, 6, 9, 7};
    int expectArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void sort() throws Exception {
        assertArrayEquals(expectArray,BubbleSort.sort1(array));
    }

    @Test
    public void sort2() throws Exception {
        assertArrayEquals(expectArray,BubbleSort.sort2(array));

    }

    @Test
    public void sort3() throws Exception {
        assertArrayEquals(expectArray,BubbleSort.sort3(array));

    }


}