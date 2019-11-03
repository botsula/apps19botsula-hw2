package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue q;
    private Object[] actualResult_ar;
    private Object[] expResult_ar;
    private Object actualResult;
    private Object expResult;

    public void generate(Queue qu, int num) {
        for (int i = 0; i < num; i++) {
            qu.enqueue(i);
        }
    }

    @Before
    public void start() {
        q = new Queue();
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekOut() {
        q.peek();
    }

    @Test
    public void testPeek() {
        generate(q, 3);
        actualResult = q.peek();
        expResult = 0;
        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDequeueOut() {
        q.dequeue();
    }

    @Test
    public void testDequeue() {
        generate(q, 3);
        expResult = 0;
        actualResult = q.dequeue();
        expResult_ar = new Object[]{2, 1};
        actualResult_ar = q.queue.toArray();
        assertEquals(expResult, actualResult);
        assertArrayEquals(expResult_ar, actualResult_ar);

    }

    @Test
    public void testEnqueue() {
        generate(q, 3);
        expResult_ar = new Object[]{2, 1, 0};
        actualResult_ar = q.queue.toArray();
        assertArrayEquals(expResult_ar, actualResult_ar);
    }
//
}
