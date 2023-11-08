import org.example.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskTest {

    @Test
    public void test1(){
        int[] tab = new int[]{3,2,-2,5,-3};
        assertArrayEquals(Task.highestAbsolutePair(tab), new int[]{3, -3});
    }

    @Test
    public void test2(){
        int[] tab = new int[]{1,1,2,-1,2,-1};
        assertArrayEquals(Task.highestAbsolutePair(tab), new int[]{1, -1});
    }

    @Test
    public void test3(){
        int[] tab = new int[]{1,2,3,-4};
        assertArrayEquals(Task.highestAbsolutePair(tab),null);
    }

    @Test
    public void test4(){
        int[] tab = new int[]{1,1};
        assertArrayEquals(Task.highestAbsolutePair(tab),null);
    }

}

