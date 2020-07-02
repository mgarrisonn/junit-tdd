import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KitchenTest {

    private Kitchen emptyKitchen;
    private Kitchen kitchenWithOne;
    private Kitchen kitchenWithMany;

    @Before
    public void setUp() throws Exception {
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("yellow");
        kitchenWithMany.add("blue");
        kitchenWithMany.add("white");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testAdd() {
        emptyKitchen.add("yellow");
        assertEquals(1,emptyKitchen.size());

        kitchenWithOne.add("blue");
        assertEquals(2, kitchenWithOne.size());

        kitchenWithOne.add("white");
        assertEquals(3, kitchenWithOne.size());

    }

    @Test
    public void testPop() {
        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());

        emptyKitchen.pop();
        assertEquals(0, emptyKitchen.size());



    }

    @Test
    public void testContains() {

    }

    @Test
    public void testPrintAll() {
    }

    @Test
    public void testSize() {
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(3, kitchenWithMany.size());
    }
}