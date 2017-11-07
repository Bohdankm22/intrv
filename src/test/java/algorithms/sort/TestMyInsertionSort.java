package algorithms.sort;

import datastructure.list.MyArrayList;
import datastructure.list.MyLinkedList;
import datastructure.list.MyList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class TestMyInsertionSort {

    private MyList<Integer> list;
    private Sortable<Integer> sort;

    public TestMyInsertionSort(Sortable<Integer> sort, MyList<Integer> list) {
        this.sort = sort;
        this.list = list;
    }

    @Parameterized.Parameters(name = "{index}: test sorting {0} and list implementation {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new MyInsertionSort<Integer>(), new MyArrayList<Integer>()},
                {new MyInsertionSort<Integer>(), new MyLinkedList<Integer>()}
        });
    }

    @Before
    public void executePrerequisites() {
        list.removeAll();
    }

    @Test
    public void testReorderBackOrder() {
        for (int i = 100; i >= 0; i--) {
            list.add(i);
        }
        sort.sort(list);
        for (int i = 0; i <= 100; i++) {
            int result = list.get(i);
            assertEquals(result, i);
        }
    }
}
