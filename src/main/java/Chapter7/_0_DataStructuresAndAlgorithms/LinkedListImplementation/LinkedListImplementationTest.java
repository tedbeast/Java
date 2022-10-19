package Chapter7._0_DataStructuresAndAlgorithms.LinkedListImplementation;

import Chapter7._0_DataStructuresAndAlgorithms.ArrayListImplementation.ArrayListImplementation;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListImplementationTest {

        /**
         * When an item is added to an empty LinkedList, its size should increase from 0 to 1.
         */
        @Test
        public void addTest1(){
            LinkedListImplementation<String> linkedList = new LinkedListImplementation<>();
            Assert.assertEquals(0, linkedList.size());
            linkedList.add("item 1");
            Assert.assertEquals(1, linkedList.size());
        }
        /**
         * Adding a large amount of items should not break the LinkedList.
         */
        @Test
        public void addTest2(){
            LinkedListImplementation<String> linkedList = new LinkedListImplementation<>();
            linkedList.add("item 1");
            linkedList.add("item 2");
            linkedList.add("item 3");
            linkedList.add("item 4");
            linkedList.add("item 5");
            linkedList.add("item 6");
            linkedList.add("item 7");
            linkedList.add("item 8");
            linkedList.add("item 9");
            linkedList.add("item 10");
            linkedList.add("item 11");
            linkedList.add("item 12");
            Assert.assertEquals(12, linkedList.size());
        }
        /**
         * Getting the item at index 0 should retrieve the first item.
         */
        @Test
        public void getTest1(){
            LinkedListImplementation<String> linkedList = new LinkedListImplementation<>();
            linkedList.add("item 1");
            String expected = "item 1";
            String actual = linkedList.get(0);
            Assert.assertEquals(expected, actual);
        }
        /**
         * Getting the item at index 1 should retrieve the second item.
         */
        @Test
        public void getTest2(){
            LinkedListImplementation<String> linkedList = new LinkedListImplementation<>();
            linkedList.add("item 1");
            linkedList.add("item 2");
            String expected = "item 2";
            String actual = linkedList.get(1);
            Assert.assertEquals(expected, actual);
        }
    }
