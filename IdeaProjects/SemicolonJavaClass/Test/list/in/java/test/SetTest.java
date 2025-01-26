package list.in.java.test;

import lists.in.java.Set;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    @Test
    public void test_that_set_is_empty() {
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void test_that_set_is_not_empty() {
        Set mySet = new Set();
        mySet.add(5);
        assertTrue(!mySet.isEmpty());
    }
    @Test
    public void test_that_set_contains_more_than_one_element() {
        Set mySet = new Set();
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        assertEquals(5,mySet.getsize(new int[]{5,6,7,8,9}));
    }
    @Test
    public void test_that_set_can_remove_element() {
        Set mySet = new Set();
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        mySet.add(7);
        assertEquals(true,mySet.isRemoved(5));
        assertEquals(5,mySet.getsize(new int[]{5,6,7,8,9}));
    }
    @Test
    public void test_that_set_can_increase_capacity() {
        Set mySet = new Set();
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        mySet.add(10);
        mySet.add(11);
        assertEquals(5,mySet.capacity(new int[]{5,6,7,8,9}));
    }

}
