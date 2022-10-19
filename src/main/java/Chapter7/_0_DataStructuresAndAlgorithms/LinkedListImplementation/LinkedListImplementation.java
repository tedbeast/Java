package Chapter7._0_DataStructuresAndAlgorithms.LinkedListImplementation;

public class LinkedListImplementation<T> {
    private LinkedNode<T> head;
    private int size;

    /**
     * Head will be null and size will be 0, which is actually the correct starting setup for a new linkedList.
     * Nothing needs to be written in the constructor.
     */
    public LinkedListImplementation(){

    }


    /**
     * Add a new item to the end of a linkedList.
     * If head is null, that means that the list must be empty: you can simply set head to be a new node.
     * Otherwise, you will need to traverse the linked list, navigating through all the elements (using size to
     * determine how many nodes to traverse), and then setting the next node of the last node to a new LinkedNode
     * containing the T item.
     *
     * @param item New item added to the ArrayList.
     */
    public void add(T item){

    }

    /**
     * Get the value at an index. For a linkedList, this will require traversing the linked list.
     * @param index index in data.
     * @return the value of data at index.
     */
    public T get(int index){
        return null;
    }

    /**
     * No need to change this method - it works and will be used in testing.
     * @return the size of the ArrayList.
     */
    public int size(){
        return size;
    }
}
