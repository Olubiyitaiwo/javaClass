package list.in.java.test;

import lists.in.java.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void test() {
        ArrayList myList = new ArrayList();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void addElement_myArrayListIsNotEmpty() {
        // Given that
        ArrayList myList = new ArrayList();
        System.out.println(myList.getSize());

        // When I
        myList.add("School");
        myList.add("Banks");

        //Assert that
        assertFalse(myList.isEmpty());
        assertEquals(2, myList.getSize());

    }

    @Test
    public void testThat_I_CanGetElements_AfterTheyAre_Added(){
        //Given that
        ArrayList myList = new ArrayList();

        // WHen I
        myList.add("School");
        myList.add("Banks");

        // Asser that
        assertFalse(myList.isEmpty());
        System.out.println(myList.getElementAtIndex(0));
        assertEquals("School", myList.getElementAtIndex(0));
        assertEquals("Banks", myList.getElementAtIndex(1));

    }

    @Test
    public void testThat_I_Can_Add_More_Capacity(){
        //Given that
        ArrayList myList = new ArrayList();

        myList.add("School");
        myList.add("Banks");
        myList.add("Churches");
        myList.add("Mosques");
        myList.add("Houses");

        assertFalse(myList.isEmpty());
        System.out.println(myList.getElementAtIndex(0));
        assertEquals("School", myList.getElementAtIndex(0));
        assertEquals("Houses", myList.getElementAtIndex(4));


        // WHen I
        myList.add("Market");


        // Assert that
        assertEquals(6, myList.getSize());
        System.out.println(myList.getElementAtIndex(5));
        assertEquals("Market", myList.getElementAtIndex(5));

    }

//    @Test
//    public void checkMyArrayListSize() {
//        ArrayList myList = new ArrayList();
//        assertTrue(myList.isEmpty());
//        myList.add("School");
//        assertEquals(1, 1);
//    }
//
//    @Test
//    public void myArrayList_elementCanBeAdded() {
//        ArrayList myList = new ArrayList();
//        myList.add("School");
//        assertTrue(myList.isEmpty());
//        myList.add("Banks");
//    }
        @Test
    public void testThat_I_Can_check_What_Is_Contained_In_Mylist(){
        // Given that
        ArrayList myList = new ArrayList();

        // when i
            //myList.equals(size);

            // assert that

        }
}
