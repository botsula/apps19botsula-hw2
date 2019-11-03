package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack s;


    public void generate(Stack st, int num) {
        for (int i = 0; i < num; i++) {
            st.push(i);
        }
    }

    @Before
    public void start() {
        s = new Stack();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekOut() {
        s.peek();
    }

    @Test
    public void testPeek() {
        generate(s, 4);
        assertEquals(3, s.peek());
    }

    @Test
    public void testPop() {
        generate(s, 4);
        assertEquals(3, s.pop());
        assertArrayEquals(new Object[]{2, 1, 0}, s.stack.toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopOut() {
        s.pop();
    }

    @Test
    public void testPush() {
        generate(s, 4);
        assertArrayEquals(new Object[]{3, 2, 1, 0}, s.stack.toArray());
    }
}
