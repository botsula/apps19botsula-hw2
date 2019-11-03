package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    private ImmutableList list;
    private Object[] add_arr = {1, 2, 3, 4};
    private Object[] actualResult_ar;
    private Object[] expResult_ar;
    private Object actualResult;
    private Object expResult;

    @Before
    public void start() {
        list = new ImmutableArrayList();
    }

    @Test
    public void testAdd() {
        expResult_ar = new Object[]{1, 2, 3};
        actualResult_ar = list.add(1).add(2).add(3).toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexOut() {
        list.add(2, 1);
    }

    @Test
    public void testAddIndex() {

        expResult_ar = new Object[]{1, 2, 3, 4};
        actualResult_ar = list.add(1).add(2).add(4).add(2, 3).toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }


    @Test
    public void testAddAll() {
        expResult_ar = new Object[]{1, 2, 3, 4};

        actualResult_ar = list.addAll(add_arr).toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }

    @Test
    public void testAddAllIndex() {
        actualResult_ar = list.add(0).add(5).add(6).addAll(1, add_arr).toArray();
        expResult_ar = new Object[]{0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expResult_ar, actualResult_ar);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllOut() {
        list.addAll(1, add_arr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOut() {
        list = list.addAll(add_arr);
        list.get(10);
    }

    @Test
    public void testGet() {
        actualResult = list.add(1).add(2).add(3).add(4).get(0);
        expResult = 1;
        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOut() {
        list.remove(1);
    }

    @Test
    public void testRemove() {
        list = list.addAll(add_arr);
        expResult_ar = new Object[]{1, 2, 4};
        actualResult_ar = list.remove(2).toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }

    @Test
    public void testSet() {
        expResult_ar = new Object[]{1, 10, 3, 4};
        actualResult_ar = list.add(1).add(2).add(3).add(4).set(1, 10).toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOut() {
        list = list.addAll(add_arr);
        list.set(10, 1);
    }

    @Test
    public void testIndexOf() {
        list = list.addAll(add_arr);
        expResult = 1;
        actualResult = list.indexOf(2);
        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOfOut() {
        list = list.addAll(add_arr);
        System.out.println(list);

        list.indexOf(11);
    }

    @Test
    public void testSize() {
        list = list.addAll(add_arr);
        expResult = 4;
        actualResult = list.size();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        expResult_ar = new Object[0];
        actualResult_ar = list.add(1).add(2).clear().toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }


    @Test
    public void testIsNotEmpty() {
        list = list.addAll(add_arr);
        expResult = false;
        actualResult = list.isEmpty();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty() {
        expResult = true;
        actualResult = list.isEmpty();
        assertEquals(expResult, actualResult);
    }

}
