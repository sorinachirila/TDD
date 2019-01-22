import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomListTest {

    // test: isEmpty, size, add, get (one), get (more)

    private CustomList myList;

    @Before
    public void createCustomList() {
        myList = new CustomList();
    }

    @Test
    public void testWhenListIsEmptyThenIsEmptyMethodReturnsTrue() {
        assertEquals(true, myList.isEmpty());
    }

    @Test
    public void testWhenListIsNonEmptyIsEmptyMethodReturnsFalse() {
        myList.add("SDA");
        assertEquals(false, myList.isEmpty());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyListSizeMethodReturnsOne() {
        myList.add("SDA");
        assertEquals(1, myList.size());
    }

    @Test
    public void testWhenAnElementIsAddedToAnEmptyListGetMethodReturnsThatElement() {
        myList.add("SDA");
        assertEquals("SDA", myList.get(0));
    }

    @Test
    public void testWhenAnElementIsAddedToAListWithAnotherElementGetMethodReturnsBoth() {
        myList.add("SDA");
        myList.add("group3");

        String element1 = myList.get(0);
        String element2 = myList.get(1);

        assertEquals("SDA", element1);
        assertEquals("group3", element2);
    }
}
