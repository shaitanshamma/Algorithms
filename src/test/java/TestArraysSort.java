import lesson2.Main2;
import lesson2.array.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArraysSort {

    ArrayImpl<Integer> array;

    @Before
    public void init(){
        array = new ArrayImpl<>();
    }

    @Test
    public void testAdd(){
        array.add(5);
        array.add(5);
       // Assert.assertArrayEquals(new int[]{5,4,5}, array.add(5));

    }

    @Test
    public void testRemove(){
        array.remove(0);
        Assert.assertArrayEquals(new int[]{4,5}, new int[]{4,5});

    }
}
